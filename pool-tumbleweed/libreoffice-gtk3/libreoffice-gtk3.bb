SUMMARY = "Gtk3 interface for LibreOffice"
DESCRIPTION = "This package contains Gtk3 interface rendering option for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-gtk3-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "3b13784367c59bb4ae4d93af28348b810fbca9aa8743982bf93c9d9fca127b99cd0f8ab06b48fa207e4f136726172af614297aa136adc718c6892a3fde24e455"

RPROVIDES:${PN} += "libreoffice-gtk3 \
libvclplug-gtk3lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libi18nlangtag.so \
libjvmaccesslo.so \
libm.so.6 \
libmergedlo.so \
libpango-1.0.so.0 \
libreoffice-gnome \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
rtld-GNU-HASH"

inherit rpm
