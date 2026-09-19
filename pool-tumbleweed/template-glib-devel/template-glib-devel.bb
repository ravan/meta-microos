SUMMARY = "Development files for Template-GLib"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language. \
 \
This package provides the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "template-glib-devel-3.40.0-1.4.aarch64.rpm"
RPM_HASH = "f5c8643ed3fc338ebc5a23e2fa4c2f737234a617b2ab8362999ab97f16a750ece78dba6ab2ea51a7003f478b408edac3a1fe27978c159d9662faebfa303c991e"

RPROVIDES:${PN} += "pkgconfig-template-glib-1.0 \
template-glib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtemplate-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-girepository-2.0 \
typelib-1-0-Template-1-0"

inherit rpm
