SUMMARY = "Image burner"
DESCRIPTION = "An image burner, written especially for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "imageburner-1.0.2-2.9.aarch64.rpm"
RPM_HASH = "640f3ea5b1f89551826624c330c2af5a8e90c7959b3d2c542e1f0735380b43c17881e55f4169a643ca1ecff246f71b03b785f830f80676028154397f1f5c29a0"

RPROVIDES:${PN} += "imageburner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0"

inherit rpm
