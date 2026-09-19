SUMMARY = "GNUnet library libgnunetnatauto"
DESCRIPTION = "This package contains the libgnunetnatauto library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetnatauto0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "e8b0a684e3c6f42785df4b9011fab94886e1d335a9e194c5d2deebc9f5fed3e3faf37deeaaa4bc424d48eabde2289efccc71fd66d2a88aed45f6bae76a1611a0"

RPROVIDES:${PN} += "libgnunetnatauto.so.0 \
libgnunetnatauto0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetnatnew.so.2 \
libgnunetutil.so.20"

inherit rpm
