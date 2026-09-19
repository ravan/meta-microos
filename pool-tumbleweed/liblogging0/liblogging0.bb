SUMMARY = "An easy to use logging library"
DESCRIPTION = "Liblogging is an easy to use logging library. \
 \
It contains the Libstdlog component is used for standard logging \
(syslog replacement) purposes via multiple channels."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "liblogging0-1.0.6-7.5.aarch64.rpm"
RPM_HASH = "aeca4821f54e86a44aab50609ffff780c10b642abadd1e4c3209b9483a5a644438cf8530dc4503761c1fed00e154ba391d357746bc4006135ff8bed0719a182f"

RPROVIDES:${PN} += "liblogging-rfc3195.so.0 \
liblogging-stdlog.so.0 \
liblogging0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
