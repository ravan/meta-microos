SUMMARY = "FOX interface for Gwenhywfar"
DESCRIPTION = "This package contains the interface to the FOX toolkit \
for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-fox16-79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "8a2acd75ba0c06d0dd6c48ea8fd762d3a54fd25a1a45fdb876dcc1cbcd8749f9b690bd66b81efc4f4306a953560ea6081dfac694484ea16122e8dd2724eb29e1"

RPROVIDES:${PN} += "libgwengui-fox16-79 \
libgwengui-fox16.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFOX-1.6.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgwengui-cpp.so.79 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
