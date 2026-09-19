SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "python3-hawkey-0.75.0-1.3.aarch64.rpm"
RPM_HASH = "64e0342ec6626dea41ea99886612b346cbb4de162f6b4789dbc4542c0f59faebf7323c96a0ce8ebc320d690a05e235295c949a733ad80a7fa294973e5d0e4d02"

RPROVIDES:${PN} += "python3-hawkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpython3.13.so.1.0 \
libsolv.so.1 \
libsolvext.so.1 \
libstdc++.so.6 \
python-abi \
python3-libdnf"

inherit rpm
