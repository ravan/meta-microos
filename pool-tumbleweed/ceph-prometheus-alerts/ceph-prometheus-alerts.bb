SUMMARY = "Prometheus alerts for a Ceph deployment"
DESCRIPTION = "This package provides Ceph default alerts for Prometheus."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "ceph-prometheus-alerts-18.2.7-8.1.noarch.rpm"
RPM_HASH = "567306b4718e2eb75919b4dcaa53b5e278a0d866c327d1c0f2fab40bea2da8dfc5c10c6f881acb39dda8051ef86daeb798d0289c01ba1c45d62efadd324690f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-prometheus-alerts \
config-ceph-prometheus-alerts"

RDEPENDS:${PN} += ""

inherit rpm
