SUMMARY = "The reliability of disk images, the flexibility of files"
DESCRIPTION = "Tools to handle creating and mounting composefs images. The composefs \
project combines several underlying Linux features to provide a very \
flexible mechanism to support read-only mountable filesystem trees, \
stacking on top of an underlying 'lower' Linux filesystem."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "composefs-1.0.8-3.11.aarch64.rpm"
RPM_HASH = "69d572131da62bc4e9dfb5a502fae2f4dfa3a3d8bb6a465c899e762b82197dc59a79ed33f18804c83b30514ab0ee84bc3daa62d3b5ee490567c4549ff34bf5f0"

RPROVIDES:${PN} += "composefs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcomposefs.so.1"

inherit rpm
