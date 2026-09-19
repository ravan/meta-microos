SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-libs-8.61-2.10.aarch64.rpm"
RPM_HASH = "8d0da58b4d5298d875492b918305dcfc008666b6cb13e82acffbbbecf6c410467a4949eef6ced589af1063da4ce1937e6933fa72571faf2e0d7df2dcb1493a9a"

RPROVIDES:${PN} += "libsignon-extension.so.1 \
libsignon-plugins-common.so.1 \
signond-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
