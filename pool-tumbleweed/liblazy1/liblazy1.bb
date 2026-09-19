SUMMARY = "Liblazy - D-Bus methods provided for convenience"
DESCRIPTION = "Liblazy is a simple and easy to use library that provides convenient \
functions for sending messages over the D-Bus daemon, querying \
information from HAL or asking PolicyKit for a privilege."
LICENSE = "LGPL-2.1+"

PV = "0.2"

RPM_NAME = "liblazy1-0.2-1.36.aarch64.rpm"
RPM_HASH = "534f58a9bad3c4247312a48c951a0e1aa0d44c045fe304d44bcc9722a2d3dc8b40d3e99f2f2a8016ee44df82d6cc8e846725ad69d44b19ee2d7fad44c860aab6"

RPROVIDES:${PN} += "liblazy.so.1 \
liblazy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
