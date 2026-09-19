SUMMARY = "Single Sign On Framework for Qt"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt5-1-8.61-2.10.aarch64.rpm"
RPM_HASH = "a042283065e59e924b1ea619de4e33a9788db1212e843c92100e48c43cce1a6a27347f56314c64ac5b7373fed9a007b09a59e19f97aacdcf96bf3475c6c89acb"

RPROVIDES:${PN} += "libsignon-qt5-1 \
libsignon-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
