SUMMARY = "Development files for libmygpo-qt6"
DESCRIPTION = "libmygpo-qt is a Qt Library that wraps the gpodder.net Web API. \
This package provides development files to use gpodder.net services in Qt 6 \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0git.20250222T125957~4dfa3ba"

RPM_NAME = "libmygpo-qt6-devel-1.2.0git.20250222T125957~4dfa3ba-1.6.aarch64.rpm"
RPM_HASH = "059f2b9d7a7f41be744158f7ca3dd1bb60dd5a1a863b0c0c4741ca3e9f7990fa7db809e217e821b006c6f873c87474ec93f3b6da54568f5351d4189433cb3a10"

RPROVIDES:${PN} += "cmake-Mygpo-qt6 \
libmygpo-qt6-devel \
pkgconfig-libmygpo-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmygpo-qt6-1 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
