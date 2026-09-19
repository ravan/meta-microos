SUMMARY = "Game oriented network API"
DESCRIPTION = "The Hawk Network Library is a wrapper over Berkeley/Unix Sockets. NL \
provides support for groups of sockets, socket statistics, high \
accuracy timer, CRC functions, macros to read and write data to \
packets with endian conversion, and support for multiple network \
transports."
LICENSE = "LGPL-2.1+"

PV = "1.6.8"

RPM_NAME = "hawknl-libs-1.6.8-1.35.aarch64.rpm"
RPM_HASH = "5772526efc028b6a51ca95ff6492691302a51af9d28c2827a8cf3c3f97915c80a9b28c25fb201e14061af7194d109548286344fb575d32b74ee9aea4e1e4c483"

RPROVIDES:${PN} += "hawknl-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
