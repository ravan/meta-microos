SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - python support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "libgensio_python_swig14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "b77029a1579e6c864efd1bf530db0adadff3dda892e9f7c89611acf3342079d4bbf06103a488bb02f935ae8248e88d033acb05eebc7e654fb3eb06de0b12f588"

RPROVIDES:${PN} += "libgensio-python-swig.so.14 \
libgensio-python-swig14 \
libgensio0-/usr/lib/libgensio-python-swig.so.0.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgensioosh.so.14 \
libpython3.13.so.1.0"

inherit rpm
