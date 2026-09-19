SUMMARY = "Generator for API documentation from Vala source"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "valadoc-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "06fae589fdf5f616e2c4454d83e0d441b2b4e500ebc3a3191ed89d6dda3b1f46e121018f50e2f89d159cd6b80adacf3392cc8396ff1585bfa4cdca35308b7f55"

RPROVIDES:${PN} += "valadoc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0 \
libvalaccodegen.so \
libvaladoc-0.56.so.0"

inherit rpm
