SUMMARY = "Maliit Framework development packages"
DESCRIPTION = "Provides headers and CMake files built for the Maliit Framework."
LICENSE = "LGPL-2.1-only"

PV = "2.3.0"

RPM_NAME = "libmaliit-devel-2.3.0-1.18.aarch64.rpm"
RPM_HASH = "1b90a4cbe1e55118663a9436adad8ed0ff504f5893460f9b2c3c5438085af446e86588eaf05746b8a884009ff4de10d8ec0611331e4c33bb6c2982e0cb7008ac"

RPROVIDES:${PN} += "cmake-MaliitGLib \
cmake-MaliitPlugins \
libmaliit-devel \
maliit-framework-devel \
pkgconfig-maliit-framework \
pkgconfig-maliit-glib \
pkgconfig-maliit-plugins \
pkgconfig-maliit-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmaliit-glib2 \
libmaliit-plugins2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-maliit-framework \
pkgconfig-maliit-plugins"

inherit rpm
