SUMMARY = "KDE Window Manager - development files"
DESCRIPTION = "KWin is Plasma window manager. \
This package provides development files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kwin6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d5ac1a3fb4e9043c0af8e97e48cec5fce41e84e58b4f8399fc20631b3a6d41f81c584b80946df18c8d2a1e9a33b8278d73674c49975d666206178d7fed2880b1"

RPROVIDES:${PN} += "cmake-KWin \
cmake-KWinDBusInterface \
kwin5-devel \
kwin6-devel"

RDEPENDS:${PN} += "kdecoration6-devel \
libkwin6 \
pkgconfig-epoxy \
pkgconfig-libdrm"

inherit rpm
