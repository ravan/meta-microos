SUMMARY = "Qt 6 Quick3DGlslParser library"
DESCRIPTION = "The Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick3DGlslParser6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "cd7323c0bacf595a2feeeb19dd78529039fd3728f9c37f9985f316be119c6c0ffbb61c79bc81cb7ab8b2b13ca0be01cb82fd4d71eabb036800217ba434cf48f0"

RPROVIDES:${PN} += "libQt6Quick3DGlslParser.so.6 \
libQt6Quick3DGlslParser6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
