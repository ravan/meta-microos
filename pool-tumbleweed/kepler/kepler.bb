SUMMARY = "Kubernetes-based Efficient Power Level Exporter"
DESCRIPTION = "Kubernetes-based Efficient Power Level Exporter"
LICENSE = "Apache-2.0 & (BSD-2-Clause | GPL-2.0-only) & GPL-2.0-only"

PV = "0.11.3"

RPM_NAME = "kepler-0.11.3-1.8.aarch64.rpm"
RPM_HASH = "115d13a5861a6f70f9b6d50d0808cdd190bc062e2534c2f1e7b0d2644f759afd3d5e4dc3363c8a294a01c1f74383d1a1e11a6b3d1a641ca44cd5a6e45d27b502"

RPROVIDES:${PN} += "config-kepler \
kepler"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
