SUMMARY = "Development Files for xfce4-panel"
DESCRIPTION = "The xfce4-panel-devel package contains development files needed to to develop \
panel plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.8"

RPM_NAME = "xfce4-panel-devel-4.20.8-1.1.aarch64.rpm"
RPM_HASH = "e2ea7041be0cb12fa00c5ee8bd71180390595c65979246de9fc17b5b162fa2f189b3e885e9d73e222d6cbc77bcf2646f9b4abfa94df4c93c47f22b5174f06536"

RPROVIDES:${PN} += "pkgconfig-libxfce4panel-2.0 \
xfce4-panel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk-layer-shell-0 \
pkgconfig-libxfce4ui-2 \
pkgconfig-libxfce4util-1.0 \
xfce4-panel"

inherit rpm
