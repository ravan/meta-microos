SUMMARY = "C++ interface for Gwenhywfar"
DESCRIPTION = "This package contains the C++ GUI interface for Gwenhywfar."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-cpp79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "0c8f2633fcd74ebc40b7e8531601fe0d08e21059e9307c251ffceceb7a15b079ced3f3a07cf1f8f40dd79a0bd8584864b8abb612cdc2e72d64d1457d28533f3f"

RPROVIDES:${PN} += "libgwengui-cpp.so.79 \
libgwengui-cpp79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
