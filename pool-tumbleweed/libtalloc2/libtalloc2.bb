SUMMARY = "Samba talloc library"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
This package includes the talloc2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "libtalloc2-2.4.4-1.3.aarch64.rpm"
RPM_HASH = "2ca64c06ff4402432816cf38e0a8c6ea9e37af777cfa2484cc25d65034b7f7fc72750a0c98935f64dfe4a2e53ab0e9309c1206b2d5cf6b23d40c0de4df661784"

RPROVIDES:${PN} += "bundled-libreplace \
libtalloc.so.2 \
libtalloc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
