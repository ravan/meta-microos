SUMMARY = "Visualizer for estimated instantaneous bandwidth on USB buses and devices"
DESCRIPTION = "A top-like utility that shows an estimated instantaneous bandwidth on USB buses and devices. \
 \
Requires the usbmon kernel module to be loaded."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "usbtop-1.0-4.5.aarch64.rpm"
RPM_HASH = "13622a077cb53b5a9eeda76a194f5bb02567cb43c2be31cc63b4d634cd5b22fe08bb1d5ba8a140786b421aab3e2f8492f9bd42d8513309a39c8d73a8b1f9e280"

RPROVIDES:${PN} += "usbtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcap.so.1 \
libstdc++.so.6"

inherit rpm
