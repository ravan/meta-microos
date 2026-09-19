SUMMARY = "Utility for the Generic HDLC layer"
DESCRIPTION = "The sethdlc utility is used to set physical interface, clock rate, \
used HDLC mode, and can add any required PVCs if using Frame Relay. \
 \
https://www.kernel.org/doc/Documentation/networking/generic-hdlc.txt"
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "sethdlc-1.18-2.4.aarch64.rpm"
RPM_HASH = "6d627e138a36aa781e0537af76959e3f503201ff80d95b78a9ae3e9580d54530855fb28e6f531a0528451d6e6e04e5991bad75d8ef4698e5be29d076650d9b2e"

RPROVIDES:${PN} += "sethdlc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
