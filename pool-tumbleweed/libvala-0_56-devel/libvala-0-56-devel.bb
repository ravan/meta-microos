SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "libvala-0_56-devel-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "479b821bd7a90d3414ff6544508647264b1af524c368edca6746a19450acfcdd75f4affb835132cfb46e0cdefdaab9b6aee7ad73165549c397866baf823ff263"

RPROVIDES:${PN} += "libvala-0-56-devel \
libvala-devel \
pkgconfig-libvala-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvala-0-56-0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
