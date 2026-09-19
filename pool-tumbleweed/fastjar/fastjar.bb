SUMMARY = "Java package archiver"
DESCRIPTION = "Fastjar is an implementation of Sun's jar utility that comes with the \
JDK, written entirely in C, and runs in a fraction of the time while \
being 100% feature compatible."
LICENSE = "GPL-2.0-or-later"

PV = "0.98"

RPM_NAME = "fastjar-0.98-28.5.aarch64.rpm"
RPM_HASH = "af818290a75e25c9e0a840d1606681658805ade8dea124638e571b4fe298bb824568ec554adb2def4d17a7255c256656ed7a88e241e58b4d9de615dd9efd4344"

RPROVIDES:${PN} += "fastjar"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
