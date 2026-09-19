SUMMARY = "Thunar extension for Font Manager"
DESCRIPTION = "This package provides integration with the Thunar file manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.4"

RPM_NAME = "thunar-font-manager-0.9.4-2.2.aarch64.rpm"
RPM_HASH = "4a13ed58ddd51e9487181941e41ac4c246325355a5c0aff93fa194f9ef51a92c811a19e6747f5b9a82b9a2f08055877843dcfca38d0a9f040401924a3b961117"

RPROVIDES:${PN} += "thunar-font-manager"

RDEPENDS:${PN} += "font-manager-common \
font-viewer \
libc.so.6 \
libfontmanager.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libthunarx-3.so.0"

inherit rpm
