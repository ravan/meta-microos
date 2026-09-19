SUMMARY = "Daemon for exposing perf counters as Prometheus metrics"
DESCRIPTION = "Daemon for exposing perf counters as Prometheus metrics"
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-exporter-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "90491d85f095f95dc2cc09c3c5d3ed55dbe739dd8b034a85540eb56e7354a6077260755f2e308d91f1741ac8dc4e86e19dd73c618ac1cbf57d8a7fa2a04ba2df"

RPROVIDES:${PN} += "ceph-exporter"

RDEPENDS:${PN} += "ceph-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
