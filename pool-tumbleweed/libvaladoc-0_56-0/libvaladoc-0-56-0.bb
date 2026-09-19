SUMMARY = "Valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "libvaladoc-0_56-0-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "033dfc6b0aafae376eb7e834fcccac8c585df865b6d9eb251188e69147f485dc3ced27f8094271b34fd7b0c321e057c1fb67e988e9afd87aa9576c106fc7df81"

RPROVIDES:${PN} += "libvaladoc-0-56-0 \
libvaladoc-0.56.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcgraph.so.8 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgvc.so.7 \
libvala-0.56.so.0 \
libvalaccodegen.so"

inherit rpm
