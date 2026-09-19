SUMMARY = "Mutter based compositor for kiosks"
DESCRIPTION = "Kiosk provides a desktop enviroment suitable for fixed purpose, or single \
application deployments like wall displays and point-of-sale systems."
LICENSE = "GPL-2.0-or-later"

PV = "50.1"

RPM_NAME = "gnome-kiosk-50.1-1.2.aarch64.rpm"
RPM_HASH = "60099846ddce476594c740c7fb386d964a4c8d5d35d69af95147445a78eb41dd31aad1740fa843cf0494202c2e1b899400b0422b0a4e43c2aafa2f6ebb279b6d"

RPROVIDES:${PN} += "gnome-kiosk"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-session \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libibus-1.0.so.5 \
libmutter-18.so.0 \
libmutter-clutter-18.so.0 \
libmutter-cogl-18.so.0 \
libmutter-mtk-18.so.0 \
libsystemd.so.0"

inherit rpm
