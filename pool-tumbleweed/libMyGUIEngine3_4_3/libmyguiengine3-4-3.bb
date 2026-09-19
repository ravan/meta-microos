SUMMARY = "Shared library for MyGUI"
DESCRIPTION = "MyGUI is a library for creating Graphical User Interfaces (GUIs) \
for games and 3D applications. \
 \
This package contains the shared library for package MyGUI."
LICENSE = "MIT"

PV = "3.4.3"

RPM_NAME = "libMyGUIEngine3_4_3-3.4.3-2.8.aarch64.rpm"
RPM_HASH = "0b7c37ab309cc994b882a47b0b568ff8b9d253c9171129a6346b0ac4af37a5617785c17f53aed3884188ecbcc648a565b93df7d87dde46ab3ae59d5b74d4c130"

RPROVIDES:${PN} += "libMyGUIEngine.so.3.4.3 \
libMyGUIEngine3-4-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
