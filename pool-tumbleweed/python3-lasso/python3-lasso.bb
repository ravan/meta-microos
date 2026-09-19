SUMMARY = "Liberty Alliance Single Sign On (lasso) Python bindings"
DESCRIPTION = "Python language bindings for the lasso (Liberty Alliance Single Sign On) \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "python3-lasso-2.9.0-1.7.aarch64.rpm"
RPM_HASH = "41f8c8de4f683853bdd74dd125035e628850c1059b80b612003431888ee9d9ab8e7a55343e3e730515f4696ef2d1687374c57e2d3e1ca8157aa7922d3637aa84"

RPROVIDES:${PN} += "python3-lasso"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblasso.so.3 \
liblasso3 \
libxml2.so.16 \
python-abi \
python3"

inherit rpm
