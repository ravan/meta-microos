SUMMARY = "Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "mozilla-nss-3.127-1.1.aarch64.rpm"
RPM_HASH = "17e214af5e5197cf8aac0a564998d0b74816905bae326922ce3d32b559a02c17a0c6fca5b17f76a20716d65fe665a2746c7aa6103017e4b57dbd5fb8dfb0c88b"

RPROVIDES:${PN} += "libnss3.so \
libnssutil3.so \
libsmime3.so \
libssl3.so \
mozilla-nss \
nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreebl3 \
libnspr4.so \
libnssckbi.so \
libplc4.so \
libplds4.so \
libsoftokn3 \
mozilla-nspr"

inherit rpm
