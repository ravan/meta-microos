SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "12.4.10"

RPM_NAME = "grafana-12.4.10-1.1.aarch64.rpm"
RPM_HASH = "30c80f6bb84faedf6c3da32c14e8bc86dcbf45b3be215731399cccf6d393819e4c9e2e5e383e6f5fa666da7f07f3d0e04a1dd5e5c1cdb4ce4f5d84aab0510e5e"

RPROVIDES:${PN} += "config-grafana \
grafana"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-grafana \
libc.so.6 \
user-grafana"

inherit rpm
