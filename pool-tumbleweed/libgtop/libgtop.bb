SUMMARY = "System status information library"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem."
LICENSE = "GPL-2.0-or-later"

PV = "2.41.3+4"

RPM_NAME = "libgtop-2.41.3+4-3.3.aarch64.rpm"
RPM_HASH = "a9d51376765471ee63a48db6e797f12009b48c6e3ae768e06debd9fd61fd39cb3b3f947a734c842f72911d217db74a8f9b23298a502dcfa5d1e9de9f78caeb04"

RPROVIDES:${PN} += "libgtop"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgtop-2.0.so.11 \
permissions"

inherit rpm
