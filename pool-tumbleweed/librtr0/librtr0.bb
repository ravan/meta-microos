SUMMARY = "Extensible RPKI-RTR-Client C library"
DESCRIPTION = "RTRlib is a C implementation of the RPKI/Router Protocol \
client. The library allows one to fetch and store validated prefix origin \
data from a RTR-cache and performs origin verification of prefixes. It \
supports different types of transport sessions (e.g., SSH, unprotected TCP) \
and is extensible."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "librtr0-0.8.0-3.5.aarch64.rpm"
RPM_HASH = "82dd7680140363f9737b42ccebcd67d79abcfe30602f2189178c8f6c2237feefa80880d26839b4422bbc9511825c6bfd331bafbe06668ab1f63ed9d164f90f62"

RPROVIDES:${PN} += "librtr.so.0 \
librtr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libssh.so.4"

inherit rpm
