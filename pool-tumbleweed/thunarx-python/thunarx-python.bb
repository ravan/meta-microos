SUMMARY = "Python Bindings for the Thunar Extension Framework"
DESCRIPTION = "This package provides the Python bindings for the Thunar Extension framework \
which allow one to create Python plugins for Thunar."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-0.5.2-1.26.aarch64.rpm"
RPM_HASH = "91ec0a2aead547f4fb76cb375b0a28d8d2f34954ed17a20bd7759968e4555cf63d3e81afee892f8a0a8d7a17b491dd4a3892bc5b00db7d60a2c19542d7dd6ffd"

RPROVIDES:${PN} += "thunarx-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpython3.13.so.1.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
