SUMMARY = "Administration library for iODBC"
DESCRIPTION = "This package provides libiodbcadm for administering iODBC"
LICENSE = "BSD-3-Clause | LGPL-2.0-only"

PV = "3.52.16"

RPM_NAME = "libiodbcadm2-3.52.16-2.3.aarch64.rpm"
RPM_HASH = "5e5f03033a2cf719454f08f10d35b50cb34cc5266b946b418fa0a9fd6a1f70af23f71e1639f9fac2e6876033161c2b2bb79fe4a4dac650ce204a601f12888887"

RPROVIDES:${PN} += "libiodbcadm.so.2 \
libiodbcadm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiodbc.so.2 \
libiodbcinst.so.2"

inherit rpm
