SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-baloo-tools-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1ec7d03f6d7df1b771fd2f11dd16ab434ee2ae956f4dc65a5adf655ed1cc7c45c061a67503a32e08e040067a459b18f7e48256537492d0218b87d0ee68d9631a"

RPROVIDES:${PN} += "kf6-baloo-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6BalooEngine.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
