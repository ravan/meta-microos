SUMMARY = "NUMA Policy Control"
DESCRIPTION = "Control NUMA policy for individual processes. Offer libnuma for \
individual NUMA policy in applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.19.27.gc9475de"

RPM_NAME = "libnuma1-2.0.19.27.gc9475de-1.3.aarch64.rpm"
RPM_HASH = "b154f3383c28236b824be101bd01158175f6fbad1a25c61a5c5e15198b1bd1c72447588a9f9b88580b518668eeaa617a3a479cffd39869470f3ea12e60bb976a"

RPROVIDES:${PN} += "libnuma.so.1 \
libnuma1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
