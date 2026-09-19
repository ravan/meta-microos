SUMMARY = "Graphical editor for the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a graphical editor for the dconf database."
LICENSE = "GPL-3.0-or-later"

PV = "49.0"

RPM_NAME = "dconf-editor-49.0-2.4.aarch64.rpm"
RPM_HASH = "8b4fb9c8500ced6b0fe01bab061ac32ad62d8caa4ba32f4b7c0d7c5eb8ce8986bec91d912bd0115cd855bd465c9721c2459dad7b92c6a37dc435415469ee1bdb"

RPROVIDES:${PN} += "dconf-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdconf.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
