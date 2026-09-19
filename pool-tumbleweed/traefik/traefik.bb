SUMMARY = "The Cloud Native Application Proxy"
DESCRIPTION = "Traefik (pronounced traffic) is a modern HTTP reverse proxy and load balancer \
that makes deploying microservices easy. Traefik integrates with your existing \
infrastructure components (Docker, Swarm mode, Kubernetes, Marathon, Consul, \
Etcd, Rancher, Amazon ECS) and configures itself automatically and dynamically. \
 \
Pointing Traefik at your orchestrator should be the only configuration step you need."
LICENSE = "MIT"

PV = "3.7.12"

RPM_NAME = "traefik-3.7.12-1.1.aarch64.rpm"
RPM_HASH = "8176daebb8fae899ea530f37430cf4a5e72e9dc7ab740bc045f38824558c82a18b73fa3d937bdaf87acf067ee60d3819d3a7a705a33ac45596430bd35f4e6322"

RPROVIDES:${PN} += "config-traefik \
group-traefik \
traefik \
user-traefik"

RDEPENDS:${PN} += "/usr/bin/sh \
logrotate \
systemd \
sysuser-shadow"

inherit rpm
