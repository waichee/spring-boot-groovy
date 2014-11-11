package org.wai.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger

@RestController
class HomeController {

  //thread-safe atomic counter for number of visits by users
  private final AtomicInteger visitorCount = new AtomicInteger();

  private final ConcurrentHashMap<Number, String> visitorCountAndMessageMap = new ConcurrentHashMap<>()

  @RequestMapping("/home")
  def index() {
    def result = [:]

    result.id = visitorCount.incrementAndGet();
    result.message = result.id / 2 == 0 ? "You're an even number visitor" :  "You're an odd number visitor!"
    //hardcoding return payload for the demo app...
    result.status = "OK"
    result.code = 200

    visitorCountAndMessageMap.putIfAbsent(result.id, result.message)
    println "visitorCountMap :${visitorCountAndMessageMap}"

    return result;
  }
}
