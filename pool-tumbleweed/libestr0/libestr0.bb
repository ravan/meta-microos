SUMMARY = "String handling essentials library"
DESCRIPTION = "This package provides the string handling essentials shared library \
used by the rsyslog daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "libestr0-0.1.11-1.26.aarch64.rpm"
RPM_HASH = "b1bd2e8f9a68773699d39194f9e222125d5db2b6baeb10221a1c2d4cc6663f1c25135595e691a3d95914273c0e9d138c70cde523e492fbc002a0d473af879549"

RPROVIDES:${PN} += "libestr.so.0 \
libestr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
