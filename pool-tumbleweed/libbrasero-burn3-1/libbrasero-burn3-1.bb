SUMMARY = "Brasero composition utility function library"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This subpackage contains a library of Brasero with utility functions related to \
abstract disc image composition (files and audio tracks)."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "libbrasero-burn3-1-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "25362cebcd82bda7609a8fd5dfbc6c5ee30f3923bac471f93f059ed468cdb9020ec188260c56851bd61880c1bda509dc728ae2c7ac0d18dd1958ca59d1a8e998"

RPROVIDES:${PN} += "libbrasero-burn3-1 \
libbrasero-burn3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libbrasero-utils3.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0"

inherit rpm
