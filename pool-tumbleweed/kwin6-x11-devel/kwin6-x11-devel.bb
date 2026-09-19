SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is Plasma window manager. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-x11-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "71ab5a866516b3cb5d8ee168fe3fb3863b5501e835de7037408d5d1a1654a434095300f4c44078efe1a3713f79946fffbc7b9943933781097df8f179e62117f4"

RPROVIDES:${PN} += "cmake-KWinX11 \
cmake-KWinX11DBusInterface \
kwin6-x11-devel"

RDEPENDS:${PN} += "kdecoration6-devel \
libkwin-x11-6 \
pkgconfig-epoxy"

inherit rpm
