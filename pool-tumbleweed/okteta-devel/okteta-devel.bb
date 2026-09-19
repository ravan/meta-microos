SUMMARY = "Development files for the Okteta Hex Editor"
DESCRIPTION = "Contains the development files for the Okteta Hex Editor."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.28"

RPM_NAME = "okteta-devel-0.26.28-1.1.aarch64.rpm"
RPM_HASH = "b4f6d77f5e06f2bfd6793afeb0a22e3383c23c8ffe600043f36b7ca45f9847c700011c2e51ff06bc2c6e5eacd2c5057de632117c0579b64908d4b9e8ad1d1d22"

RPROVIDES:${PN} += "cmake-KastenControllers \
cmake-KastenCore \
cmake-KastenGui \
cmake-OktetaCore \
cmake-OktetaGui \
cmake-OktetaKastenControllers \
cmake-OktetaKastenCore \
cmake-OktetaKastenGui \
okteta-devel \
pkgconfig-OktetaCore \
pkgconfig-OktetaGui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libKasten4 \
libOkteta3 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-OktetaCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Widgets"

inherit rpm
