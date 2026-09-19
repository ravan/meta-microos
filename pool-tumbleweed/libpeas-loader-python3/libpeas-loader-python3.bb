SUMMARY = "Python3 runtime loader for libpeas"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package contains the python3 loader."
LICENSE = "LGPL-2.1-or-later"

PV = "1.38.1"

RPM_NAME = "libpeas-loader-python3-1.38.1-1.3.aarch64.rpm"
RPM_HASH = "c6b9ae4360fcd6128edc1969fb166f7e32e57dc8e8c340e3f899ecb3e7dfa43cae292fe2fb18e4c64873903d03e6ad90a54eefe74ecd50b291c2115b3d4d9561"

RPROVIDES:${PN} += "libpeas-loader-python3 \
libpython3loader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-1.0.so.1 \
libpython3.13.so.1.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
