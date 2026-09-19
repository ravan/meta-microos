SUMMARY = "Development files for the libfixbuf library"
DESCRIPTION = "libfixbuf is a compliant implementation of the IPFIX Protocol, as defined in \
RFC 5101. It supports the information model defined in RFC 5102, extended as \
proposed by RFC 5103 to support information elements for representing biflows. \
libfixbuf supports UDP, TCP, SCTP, TLS over TCP, and Spread as transport \
protocols."
LICENSE = "LGPL-3.0-only"

PV = "2.5.4"

RPM_NAME = "libfixbuf9-2.5.4-1.4.aarch64.rpm"
RPM_HASH = "a34f68359dcf51a40d194863a7dd0f9dbd13e53226ed59a378ca53c4b2fb2eaa264bfd4b976b7030687d7806347ac9daad203c9155841cf0773fba9e050cf82b"

RPROVIDES:${PN} += "libfixbuf.so.9 \
libfixbuf9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
