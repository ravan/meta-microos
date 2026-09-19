SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-1-1-0.9.1+git20170322-5.8.aarch64.rpm"
RPM_HASH = "e4b0a39a4cebd8ae0d4fc5cd560ef11b10c57e019677f28c89802a77e677422ac33e3f454b6c55b55aeefc4b1d23ef7ec7abedfcfed7edc61fc6214442a44653"

RPROVIDES:${PN} += "libdbus-c++-glib-1-1 \
libdbus-c++-glib-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
