SUMMARY = "Automatic proxy configuration management for applications"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
Proxy autoconfiguration (PAC) requires JavaScript (which most \
applications do not have), and determing the PAC script location \
requires a WPAD protocol implementation, which complicates proxy \
support. libproxy exists to abstract this issue and provides \
an answer how to reach a certain network resource."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "libproxy1-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "956458256249f56035e73629e5dd5a67fadc8e1dbe1fc16af8604f6921f4d071357e1cab80658fc9b57c81a9bc035a31af276c9bf74f1f519ee9b5274a31bb19"

RPROVIDES:${PN} += "libproxy.so.1 \
libproxy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpxbackend-1.0.so"

inherit rpm
