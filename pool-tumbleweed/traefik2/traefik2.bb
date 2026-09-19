SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "2.11.56"

RPM_NAME = "traefik2-2.11.56-1.1.aarch64.rpm"
RPM_HASH = "f43817ea963712de6625046e669f650e4b51af576b9baa9de0adc80c67bbea73fd866ac805199d7dd165a5292707cc6066acbbf5eb8f105c76b2833b8f5deb66"

RPROVIDES:${PN} += "config-traefik2 \
group-traefik \
traefik \
traefik2 \
user-traefik"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd \
sysuser-shadow"

inherit rpm
