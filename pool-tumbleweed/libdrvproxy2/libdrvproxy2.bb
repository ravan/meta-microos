SUMMARY = "Administration library for iODBC"
DESCRIPTION = "This package provides libdrvproxy for administering iODBC"
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "libdrvproxy2-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "34ebd1d221403c497f180cdd113ed17b1d6ccbdbbf684a40858cd79449cf30f182c67bef447ee7e9b996674d1feb45cf04b7a5e4ee0c608ce79f6e0535e23a2a"

RPROVIDES:${PN} += "libdrvproxy.so.2 \
libdrvproxy2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiodbcadm.so.2 \
libiodbcinst.so.2"

inherit rpm
