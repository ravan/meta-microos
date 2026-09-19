SUMMARY = "CD drive library for KDE Platform"
DESCRIPTION = "The KDE Compact Disc library provides an API for applications using \
the KDE Platform to interface with the CD drives for audio CDs."
LICENSE = "GPL-2.0-or-later"

PV = "25.12.3"

RPM_NAME = "libKCompactDisc6-5-25.12.3-1.3.aarch64.rpm"
RPM_HASH = "c4822d540e6a799f55ce2d399ddea100e5e59dbb221d839a6844bfd2b4c8c7923de85455d3bfc75b6ac433622e137961d8042f1d6af4aff06ee8988b0f5ea518"

RPROVIDES:${PN} += "libKCompactDisc6-5 \
libKCompactDisc6.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libasound.so.2 \
libc.so.6 \
libphonon4qt6.so.4 \
libstdc++.so.6"

inherit rpm
