SUMMARY = "Xfdashboard Development Files"
DESCRIPTION = "This package provides files required for development for Xfdashboard."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "xfdashboard-devel-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "4145d4ea62d70a3ebbcdb7a10ed99608123a6ea11f715a0ac7ef81dae802d2b6dab5fa46961cc9b0742b70182b23c69479bdd3bea61cb781bb68bab354f2ab13"

RPROVIDES:${PN} += "pkgconfig-libxfdashboard \
xfdashboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfdashboard0 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-cogl-1.0 \
pkgconfig-clutter-gdk-1.0 \
pkgconfig-cogl-1.0 \
pkgconfig-garcon-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libwnck-3.0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xdamage \
pkgconfig-xinerama"

inherit rpm
