SUMMARY = "Prometheus exporter for machine metrics"
DESCRIPTION = "Prometheus exporter for hardware and OS metrics exposed by *NIX kernels, \
written in Go with pluggable metric collectors."
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "golang-github-prometheus-node_exporter-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "2df783a4a9ff1716ba0ed39d5d15cc9f166540e68f9e3b09902bae101323529ff1f414905663556ee76462cb2ec0a52272497a3f39231ffd5e92978d3d00eced"

RPROVIDES:${PN} += "golang-github-prometheus-node-exporter \
node-exporter \
prometheus-node-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-prometheus \
user-prometheus"

inherit rpm
