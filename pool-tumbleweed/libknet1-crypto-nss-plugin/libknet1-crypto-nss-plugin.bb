SUMMARY = "Provides libknet1 nss support"
DESCRIPTION = "Provides NSS crypto support for libknet1."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-crypto-nss-plugin-1.33-2.2.aarch64.rpm"
RPM_HASH = "3dbd715e4edfaea46bbcb36e3e98a07cb9a850a0fc143fdee84d18d3b665973b203d1e769feedb6b1ab2e9a4b6df111c99ae7c9bf92c2a1535890045830386bc"

RPROVIDES:${PN} += "libknet1-crypto-nss-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
libnspr4.so \
libnss3.so \
libplds4.so"

inherit rpm
