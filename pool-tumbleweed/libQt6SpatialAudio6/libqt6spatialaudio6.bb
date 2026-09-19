SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6SpatialAudio6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f1654170a930000526721435f3401155c6b34285c1e7b2ef7aa64d2b7cb668a55468081d12fa4ca3b8af9b8c98bccacf0cfd56ba26c21644973e93519e91a771"

RPROVIDES:${PN} += "libQt6SpatialAudio.so.6 \
libQt6SpatialAudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
