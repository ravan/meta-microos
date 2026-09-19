SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Scxml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5a1e6c43b27d7713743d060fd66e06553fd6cc1dad3cea4927469527ca9447213faabfc91d32045fd6cbff2387de3326a88cd5c813eca2cd0ab024ddc345c114"

RPROVIDES:${PN} += "libQt6Scxml.so.6 \
libQt6Scxml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
