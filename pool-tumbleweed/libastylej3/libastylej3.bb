SUMMARY = "Java bindings for astyle"
DESCRIPTION = "This package contains Java bindings for astyle."
LICENSE = "MIT"

PV = "3.6.14"

RPM_NAME = "libastylej3-3.6.14-1.3.aarch64.rpm"
RPM_HASH = "30a3ff767b950065dfe1c1914887a9cf3460f59308210a1f1d4613140935c2e23fcb499d557abc47bedcdbb403619ec6dbb366699b4966a7d47cdb8d42184d89"

RPROVIDES:${PN} += "libastylej.so.3 \
libastylej3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
