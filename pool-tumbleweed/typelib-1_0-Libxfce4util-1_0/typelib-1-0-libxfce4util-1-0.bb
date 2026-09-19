SUMMARY = "Utility Library for the Xfce Desktop Environment"
DESCRIPTION = "libxfce4util is a general-purpose utility library with core application support \
for the Xfce Desktop Environment."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "typelib-1_0-Libxfce4util-1_0-4.20.1-1.5.aarch64.rpm"
RPM_HASH = "95a9b4a3f6669d181585f50ddf035c61c0c965b51a709f1056b5411de11eb39a104a40494d6b73e3d33602606afb5bd04d4813d7845b6a655e501bb57dca8a14"

RPROVIDES:${PN} += "typelib-1-0-Libxfce4util-1-0 \
typelib-1-0-libxfce4util-1-0 \
typelib-Libxfce4util"

RDEPENDS:${PN} += "libxfce4util.so.7 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
