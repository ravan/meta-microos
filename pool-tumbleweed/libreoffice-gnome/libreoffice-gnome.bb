SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-gnome-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "fd81ba344441e91e23fa2a4588c8b94b9ce29b908b7748195a86e65fe9305c4c3e8f42f7e48510ad5c6a78e2d6db2c9b0c0416e21f5c64b3dafee53f8ed9724a"

RPROVIDES:${PN} += "libevoablo.so \
liblosessioninstalllo.so \
libreoffice-gnome \
libucpgio1lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfilelo.so \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libi18nlangtag.so \
libm.so.6 \
libmergedlo.so \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
rtld-GNU-HASH"

inherit rpm
