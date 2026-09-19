SUMMARY = "Grafana Dashboards for Pacemaker/Corosync HA Clusters"
DESCRIPTION = "Grafana Dashboards displaying metrics about Pacemaker/Corosync High Availability Clusters."
LICENSE = "Apache-2.0"

PV = "1.1.0+git.1622804483.3ca98bd"

RPM_NAME = "grafana-ha-cluster-dashboards-1.1.0+git.1622804483.3ca98bd-1.14.noarch.rpm"
RPM_HASH = "d55291f4c2da535d39552220f576d7c0f73a9e6b8cfcb7155b35de94ab21830344d6e118fec43688621bc514b35b5b9a11adfe33ecf299071218b6bf2454b86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-ha-cluster-dashboards \
grafana-ha-cluster-dashboards"

RDEPENDS:${PN} += "/usr/bin/sh \
grafana-sleha-provider \
group-grafana \
shadow \
user-grafana"

inherit rpm
