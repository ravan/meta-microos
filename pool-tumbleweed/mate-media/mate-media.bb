SUMMARY = "MATE Desktop multimedia stack"
DESCRIPTION = "This package provides the Multimedia stack used by the MATE Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "mate-media-1.28.1-2.10.aarch64.rpm"
RPM_HASH = "ccd9214eda240add76a5872b4bb7fb83851590a65a2b9f45e0ee040b4916d20d44d0532d912b20b2284ef6ff767544f0aa41aaa7c63fe2e7af7186baa7cb271b"

RPROVIDES:${PN} += "config-mate-media \
liblibmate-volume-control-applet.so \
mate-media"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libmatemixer.so.0 \
libpango-1.0.so.0 \
libxml2.so.16"

inherit rpm
