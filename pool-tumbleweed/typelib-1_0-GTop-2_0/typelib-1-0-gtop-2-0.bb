SUMMARY = "Introspection bindings for libgtop"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem. \
 \
This package provides the GObject Introspection bindings for libgtop."
LICENSE = "GPL-2.0-or-later"

PV = "2.41.3+4"

RPM_NAME = "typelib-1_0-GTop-2_0-2.41.3+4-3.3.aarch64.rpm"
RPM_HASH = "d1886f1306c42900ac762c42785d1526098cc89d70b9fff95713d118cad26b63f300cd91570bd729f0757f575ff8ea349fbf8efc7c2a317f12595f995c389840"

RPROVIDES:${PN} += "typelib-1-0-GTop-2-0 \
typelib-GTop"

RDEPENDS:${PN} += "libgtop-2.0.so.11"

inherit rpm
