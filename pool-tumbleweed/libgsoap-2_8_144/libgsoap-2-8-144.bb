SUMMARY = "Runtime libraries for gSOAP"
DESCRIPTION = "gSOAP is a toolkit for C and C++ server and client Web service \
applications, and is responsible for e.g. HTTP request handling and \
the serialization of XML."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.144"

RPM_NAME = "libgsoap-2_8_144-2.8.144-1.1.aarch64.rpm"
RPM_HASH = "3f72b523a1ae30477fae47e90f1787bfb695ec2c25b9576a1ad691420ef23a29906cd29ba619d4c2d79bd618e326f1780b8acfb13ce75f7473c1f64097663ca9"

RPROVIDES:${PN} += "libgsoap++-2.8.144.so \
libgsoap-2-8-144 \
libgsoap-2.8.144.so \
libgsoapck++-2.8.144.so \
libgsoapck-2.8.144.so \
libgsoapssl++-2.8.144.so \
libgsoapssl-2.8.144.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
