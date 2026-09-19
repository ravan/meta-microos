SUMMARY = "Grafana configuration providers for the SLES HA Extension"
DESCRIPTION = "Automated configuration provisioners leveraged by other packages to enable a zero-config installation of Grafana dashboards."
LICENSE = "Apache-2.0"

PV = "1.1.0+git.1622804483.3ca98bd"

RPM_NAME = "grafana-sleha-provider-1.1.0+git.1622804483.3ca98bd-1.14.noarch.rpm"
RPM_HASH = "06947887b9480dfb59e2cb094cda503321202d24cf063865bab907c84cd04c90e59e5499f932206e5bfe93d3e259fc7fbf057a01de91e98e2c76997598aea2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sleha-provider \
grafana-sleha-cluster-provider \
grafana-sleha-provider"

RDEPENDS:${PN} += ""

inherit rpm
