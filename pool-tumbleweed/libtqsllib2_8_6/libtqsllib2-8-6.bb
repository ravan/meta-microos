SUMMARY = "TrustedQSL ham-radio library"
DESCRIPTION = "The TrustedQSL applications are used for generating digitally signed \
QSO records (records of Amateur Radio contacts). \
 \
This package contains the shared library."
LICENSE = "SUSE-Permissive"

PV = "2.8.6"

RPM_NAME = "libtqsllib2_8_6-2.8.6-1.2.aarch64.rpm"
RPM_HASH = "d2a9c72b04282b38da70ef1c32d4e99dba13a93131e0439118c82fb377076dcd3095190e26d3cf651098811a2d9bde7944f97112d31448a3513fb6eedfed450b"

RPROVIDES:${PN} += "libtqsllib.so.2.8.6 \
libtqsllib2-8-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
