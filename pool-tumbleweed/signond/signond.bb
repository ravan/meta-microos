SUMMARY = "Single Sign On Framework"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "signond-8.61-2.10.aarch64.rpm"
RPM_HASH = "9ea28942d043c21123afcdedea8f520da5f218376f77a911c2c9358a2ce2d68f5271f4d85e5681ac1ab7bca92159da9c60702677196579c20d262f5f9e01baa4"

RPROVIDES:${PN} += "config-signond \
signond"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libsignon-extension.so.1 \
libsignon-plugins-common.so.1 \
libsignon-plugins.so.1 \
libstdc++.so.6 \
qt6-sql-sqlite \
signond-libs"

inherit rpm
