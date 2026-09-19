SUMMARY = "Development files for Tepl, a text editor framework"
DESCRIPTION = "Tepl is a library that eases the development of GtkSourceView-based text \
editors and IDEs. It is a continuation/rename of Gtef. \
 \
This subpackage contains the header files for developing \
applications that want to make use of tepl."
LICENSE = "LGPL-3.0-or-later"

PV = "6.14.0"

RPM_NAME = "libgedit-tepl-devel-6.14.0-2.5.aarch64.rpm"
RPM_HASH = "58f11bf11f3cd6859478ee06865596ae133d3cd1e2a8cffd210397cde7e61c86bedcfe77626aa28033be16d969e061133865b75259b95b9d7c606c243fb2e317"

RPROVIDES:${PN} += "libgedit-tepl-devel \
pkgconfig-libgedit-tepl-6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgedit-tepl-6-4 \
pkgconfig-gio-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-icu-i18n \
pkgconfig-icu-uc \
pkgconfig-libgedit-amtk-5 \
pkgconfig-libgedit-gfls-1 \
pkgconfig-libgedit-gtksourceview-300 \
pkgconfig-libhandy-1 \
typelib-1-0-Tepl-6"

inherit rpm
