SUMMARY = "Python3 runtime loader for libpeas"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package contains the Python loader."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "libpeas2-loader-python-2.2.1-2.4.aarch64.rpm"
RPM_HASH = "89a83b26ebc372e7ba4ded06378d955346ebf5e6dc6a83317429738bd81b0ced3c617b8a4b9c093c24848ac79ad0457131ff3d835e133a43947d21ec5819b622"

RPROVIDES:${PN} += "libpeas2-loader-python \
libpythonloader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-2.so.0 \
libpython3.13.so.1.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
