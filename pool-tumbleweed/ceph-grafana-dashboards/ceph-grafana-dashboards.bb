SUMMARY = "The set of Grafana dashboards for monitoring purposes"
DESCRIPTION = "This package provides a set of Grafana dashboards for monitoring of \
Ceph clusters. The dashboards require a Prometheus server setup \
collecting data from Ceph Manager 'prometheus' module and Prometheus \
project 'node_exporter' module. The dashboards are designed to be \
integrated with the Ceph Manager Dashboard web UI."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-grafana-dashboards-18.2.7-8.1.noarch.rpm"
RPM_HASH = "4c4303969dcb6a857d80c981998fc3e004881a3250882eff39595fd565e6c7a7946f009bd220ccdb17522630f2fa07cb5dd3ce5696add0906c4d0acd9b7df3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-grafana-dashboards \
config-ceph-grafana-dashboards"

RDEPENDS:${PN} += ""

inherit rpm
