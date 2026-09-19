SUMMARY = "An object oriented interface to the cfitsio library"
DESCRIPTION = "It is designed to make the capabilities of cfitsio available to programmers \
working in C++. It is written in ANSI C++ and implemented using the C++ \
Standard Library with namespaces, exception handling, and member template \
functions."
LICENSE = "MIT"

PV = "2.7"

RPM_NAME = "libCCfits2_7-2.7-2.5.aarch64.rpm"
RPM_HASH = "34fd181a6e4c1fc5f471dbaf2db2252a79b79bd3f6491086ff186b105c8f5eba848db1d401c2117459356567e024328c229f3caeb62a2c724774779c12877fa4"

RPROVIDES:${PN} += "libCCfits.so.2.7 \
libCCfits2-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
