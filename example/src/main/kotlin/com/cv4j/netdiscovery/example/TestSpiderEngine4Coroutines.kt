package com.cv4j.netdiscovery.example

import com.cv4j.netdiscovery.coroutines.Spider
import com.cv4j.netdiscovery.coroutines.SpiderEngine

/**
 * Created by tony on 2018/8/14.
 */
fun main(args: Array<String>) {

    val spiderEngine = SpiderEngine.create()

    spiderEngine
            .addSpider(Spider.create().name("tony1").repeatRequest(1000,"http://www.163.com").initialDelay(1200))
            .addSpider(Spider.create().name("tony2").repeatRequest(1000,"http://www.126.com").initialDelay(1200))
            .addSpider(Spider.create().name("tony3").repeatRequest(1000,"https://www.baidu.com").initialDelay(1200))
            .httpd(8080)
            .runWithRepeat()
}