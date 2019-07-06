# scalatra-audit-trail #

## Build & Run ##

```bash
$ sbt
> ~;jetty:stop;jetty:start
> browse
```

launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## todo ##

* Create Kafka client - **complete**
* Add dockerfile to integrate test cluster to consume from - see [here](https://hub.docker.com/r/wurstmeister/kafka/)
* Add endpoint to send message to docker
* work out how to programatically reset read index / flus all content & rebuild from event store
