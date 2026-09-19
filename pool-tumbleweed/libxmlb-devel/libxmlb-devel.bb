SUMMARY = "Development package for libxmlb"
DESCRIPTION = "Files for development with libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.29"

RPM_NAME = "libxmlb-devel-0.3.29-2.1.aarch64.rpm"
RPM_HASH = "b90c3b30b18531dc16a66f52070d1a556dbf260292dd5a5b24a2cfd3dc7c509829c734e861626b0ee9854128495f8dec97158987c6907807a21d5f23b3699c44"

RPROVIDES:${PN} += "libxmlb-devel \
pkgconfig-xmlb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlb2 \
pkgconfig-gio-2.0 \
pkgconfig-liblzma \
pkgconfig-libzstd \
typelib-1-0-Xmlb-1-0 \
xmlb-tool"

inherit rpm
