SUMMARY = "Session manager for the COSMIC desktop environment"
DESCRIPTION = "Session manager for the COSMIC desktop environment."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-session-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "979932202569c18827c84f800427fc0daf84e48420969c99186ba4f5c60b53cc10510d87a69c6729f720c40235274358097d7ad9be6c9fd22790c93cd6bdb3a0"

RPROVIDES:${PN} += "cosmic-session"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
switcheroo-control"

inherit rpm
