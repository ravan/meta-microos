SUMMARY = "Prometheus exporter for Pacemaker HA clusters metrics"
DESCRIPTION = "Prometheus exporter for Pacemaker HA clusters metrics"
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "prometheus-ha_cluster_exporter-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "e0b437565e3b44fee8b08860781c43a614340dc89f5a65af35f3d95768023d7eb3d5bc88d1822ca30b3894988c813b5b5ef2fd115a32288e4e73911b04dfb0ee"

RPROVIDES:${PN} += "ha-cluster-exporter \
prometheus-ha-cluster-exporter"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
