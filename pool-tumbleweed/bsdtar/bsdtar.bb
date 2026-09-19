SUMMARY = "Utility to read several different streaming archive formats"
DESCRIPTION = "This package contains the bsdtar cmdline utility."
LICENSE = "BSD-2-Clause"

PV = "3.8.9"

RPM_NAME = "bsdtar-3.8.9-1.1.aarch64.rpm"
RPM_HASH = "a877207cc312970bdc0962f8ad34fe183f8c8c7b96ee4b247db2eaedc41dcded1a6f852f522516f5f7e1ddb48526ef53f404600ace805d7e7d905ed0ea2a36c5"

RPROVIDES:${PN} += "bsdtar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libarchive13 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
liblzma.so.5 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
