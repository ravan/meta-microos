SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6FileMetaData3-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "87333ee3a253002f0189a528c52c53189775a34380efe58593e5c81954b7325a8ee9134d45eb8e32649d19782ac0586e36697f7b65405f5ee7fab3ca24cce717"

RPROVIDES:${PN} += "libKF6FileMetaData.so.3 \
libKF6FileMetaData3"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kfilemetadata \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
