SUMMARY = "Development files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-devel-3.12.2-12.7.aarch64.rpm"
RPM_HASH = "265a95876f44c425cb34af3aa8a5bd6167d5774af3b1246b3b2346420683fb826b145bc4c3113e0884b1c935d05e9b8f899559960036b12ade492d55d7beaaed"

RPROVIDES:${PN} += "libcryptui-devel \
pkgconfig-cryptui-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptui0 \
pkgconfig-dbus-glib-1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-CryptUI-0-0"

inherit rpm
