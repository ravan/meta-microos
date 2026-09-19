SUMMARY = "Python bindings for libversion"
DESCRIPTION = "Libversion is an advanced version string comparison library. It can \
compare versions of software packages, including complex cases like \
1.2-x.3~alpha4. Is is used by the Repology project. \
 \
This package contains the Python bindings for libversion."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "python313-libversion-1.2.4-1.14.aarch64.rpm"
RPM_HASH = "e4f411bc16eb514dabbe4e2f458f42d1c3e218b4b64a63330723935f6f4cfb34dc7a67288d87be13a33e48bf2628cbeca11c31eb6c714ec47944511b63bf30f2"

RPROVIDES:${PN} += "python3-libversion \
python3.13dist-libversion \
python313-libversion \
python3dist-libversion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libversion.so.1 \
python-abi"

inherit rpm
