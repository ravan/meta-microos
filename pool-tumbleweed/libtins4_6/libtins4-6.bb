SUMMARY = "C++ library for manipulating raw network packets"
DESCRIPTION = "The library provides a C++ interface for creating tools which \
need to send, receive and manipulate specially crafted packets."
LICENSE = "BSD-2-Clause"

PV = "4.6"

RPM_NAME = "libtins4_6-4.6-1.1.aarch64.rpm"
RPM_HASH = "a22f3343c957ca73f326c85bd23574554f9c93c1556d876227e37e481aa794326831ea41cb78f1727ed3dec7c4240567359353af668b7b505773140ae2b5782a"

RPROVIDES:${PN} += "libtins.so.4.6 \
libtins4-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libstdc++.so.6"

inherit rpm
