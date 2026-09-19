SUMMARY = "Python bindings for Caja"
DESCRIPTION = "This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "python-caja-1.28.0-1.9.aarch64.rpm"
RPM_HASH = "b79a5adc0d517ebbe78233df3e825b6f197acdd9c68f6920803ff3894fdc04e8ceb39ba49fef46660d585fe546079cd7553d79b9d63cdd0af87a8acfacf0e027"

RPROVIDES:${PN} += "libcaja-python.so \
python-caja \
python-mate-file-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpython3.13.so.1.0 \
python3-gobject \
typelib-Caja"

inherit rpm
