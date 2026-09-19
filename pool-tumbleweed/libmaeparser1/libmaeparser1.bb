SUMMARY = "The maeparser shared library"
DESCRIPTION = "This package contains the maeparser shared library."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "libmaeparser1-1.3.3-1.3.aarch64.rpm"
RPM_HASH = "57c4fb0e8d6999e9ca289ca6d33238d753aee7b049eaba9bb9b219dc89c9532974c69aa18a56b732ceeccc4c8241c8c51ec2a4c7305c7249c479a3f1983f67b6"

RPROVIDES:${PN} += "libmaeparser.so.1 \
libmaeparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
