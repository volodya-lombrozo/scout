# Scout

Monitoring agent

# How to run simple agent

Docker command for running a simple scout agent:
 ```shell
docker run \
    -d \
    -e prometheus.server.host=138.197.181.32:9091 \
    --name scout.monitoring.agent \
    ghcr.io/volodya-lombrozo/scout:publish
```
**docker-compose** file example:
```yaml
version: "3.8"
services:
  scout:
    container_name: scout.monitoring.agent
    image: ghcr.io/volodya-lombrozo/scout:publish
    environment:
      - prometheus.server.host=138.197.181.32:9091
```

# Self-hosted solution
**docker-compose** file example all 
services on your own instance:
```yaml
version: "3.8"
services:
  prometheus:
    container_name: scout.prometheus
    image: prom/prometheus
    ports:
      - "9090:9090"
    volumes:
      - "./prometheus/prometheus.yml:/etc/prometheus/prometheus.yml"

  pushgateway:
    container_name: scout.pushgateway
    image: prom/pushgateway
    ports:
      - "9091:9091"

  grafana:
    container_name: scout.grafana
    image: grafana/grafana-enterprise:8.1.5
    ports:
      - "80:3000"
    volumes:
      - ".grafana:/var/lib/grafana"
```


#Links

* [Scout Grafana](http://138.197.181.32)
* Open pushgateway access: 138.197.181.32:9091
* Internal scout pull controller: scout.agent:8080/metrics (GET)