SUMMARY = "Development files for the Assistive Technology Service Provider Interface"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.60.6"

RPM_NAME = "at-spi2-core-devel-2.60.6-1.1.aarch64.rpm"
RPM_HASH = "f57cd4e090bd387a631458f0267b03932397d7397f49fb08881068f5bb617b065e62fce048064004e1e7990bcbc7d297f8a190811d870f66f24b5e0e419f581b"

RPROVIDES:${PN} += "at-spi2-atk-devel \
at-spi2-core-devel \
atk-devel \
pkgconfig-atk \
pkgconfig-atk-bridge-2.0 \
pkgconfig-atspi-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
at-spi2-core \
libatk-1-0-0 \
libatk-bridge-2-0-0 \
libatspi0 \
pkgconfig-atk \
pkgconfig-atspi-2 \
pkgconfig-dbus-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-x11 \
pkgconfig-xi \
pkgconfig-xtst \
typelib-1-0-Atk-1-0 \
typelib-1-0-Atspi-2-0"

inherit rpm
