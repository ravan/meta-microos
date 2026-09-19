SUMMARY = "System NSS Initialization"
DESCRIPTION = "Default Operation System module that manages applications loading \
NSS globally on the system. This module loads the system defined \
PKCS #11 modules for NSS and chains with other NSS modules to load \
any system or user configured modules."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "mozilla-nss-sysinit-3.127-1.1.aarch64.rpm"
RPM_HASH = "4f671cff82072e199f7ccad71efe0c8f25b0c9b1762f2075a5b0ae5ba903b72e1e8b2c03e1d16b75e8e2f57c57a257010b643a637e637a0d795b4265350a4c38"

RPROVIDES:${PN} += "config-mozilla-nss-sysinit \
libnsssysinit.so \
mozilla-nss-sysinit"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnssutil3.so \
libplc4.so \
mozilla-nss \
sed"

inherit rpm
