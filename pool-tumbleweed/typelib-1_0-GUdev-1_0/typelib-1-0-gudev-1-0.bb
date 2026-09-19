SUMMARY = "GObject library, to access udev device information -- Introspection bindings"
DESCRIPTION = "This package provides the GObject Introspection bindings for libgudev, which \
provides access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "typelib-1_0-GUdev-1_0-238-1.13.aarch64.rpm"
RPM_HASH = "ee32139bb8a3700fa08d298afa8b03b396e69eabb5e885a35c9365e829c34f44168a2e17905b1701bd6679616b1012b849fd54d41e1797288b7ae41ad9b589e0"

RPROVIDES:${PN} += "typelib-1-0-GUdev-1-0 \
typelib-GUdev"

RDEPENDS:${PN} += "libgudev-1.0.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
