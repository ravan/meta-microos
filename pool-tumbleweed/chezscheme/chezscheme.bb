SUMMARY = "A superset of the R6RS Scheme language"
DESCRIPTION = "Chez Scheme is an implementation of the Revised6 Report on Scheme (R6RS) with numerous language and programming environment extensions."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-2.0-only & Zlib & SUSE-GPL-2.0-with-linking-exception"

PV = "10.3.0"

RPM_NAME = "chezscheme-10.3.0-1.4.aarch64.rpm"
RPM_HASH = "9a1b4563e90df532943b1107a32150e7af5e0a5feda6576e35ee0ad1ee32524cd500867f879cc3c086e13bec3b1dcf2f8c20c334099e74662e7240a7f17e0b67"

RPROVIDES:${PN} += "chezscheme"

RDEPENDS:${PN} += "libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
