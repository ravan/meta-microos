SUMMARY = "Library for checking installation or Live media"
DESCRIPTION = "Library for checking installation or Live media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "7.1"

RPM_NAME = "libmediacheck7-7.1-1.3.aarch64.rpm"
RPM_HASH = "5dc717d301489db1c7b22774dc1743104b5ff09f94210ecb4c57d21e509e1efd0de0d14ba7f40b796107427049674363a4fafd54fd50bd8e1c89ea83dff75ab4"

RPROVIDES:${PN} += "libmediacheck.so.7 \
libmediacheck7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
