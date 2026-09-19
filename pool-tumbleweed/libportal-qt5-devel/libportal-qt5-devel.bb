SUMMARY = "Headers for libportal Qt5 integration library"
DESCRIPTION = "The libportal-qt5-devel package contains libraries, build data, and \
header files for developing applications that use libportal-qt5."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-qt5-devel-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "f60a387fe8f56327aa0872c860036810ca247257cb44e6f445077ed0277460b6fa1fe786597df40c9091310b21e95cf1c33408df7429bfb597f50a5dbdb8aa75"

RPROVIDES:${PN} += "libportal-qt5-devel \
pkgconfig-libportal-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5X11Extras \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-libportal"

inherit rpm
