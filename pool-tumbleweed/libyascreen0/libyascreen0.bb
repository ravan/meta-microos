SUMMARY = "Yet Another Screen Library (lib(n)curses alternative)"
DESCRIPTION = "yascreen is a lib(n)curses alternative, oriented towards modern terminals."
LICENSE = "LGPL-3.0-or-later"

PV = "2.11"

RPM_NAME = "libyascreen0-2.11-1.3.aarch64.rpm"
RPM_HASH = "a70a865e2ca20dbee43cb777437a09932455db322dad3fa576cea8a71a24dfb0805a3d625d18da5495196b8e5ec9bcad32ae55ba5a4325bbc9bee0e53179d017"

RPROVIDES:${PN} += "libyascreen.so.0 \
libyascreen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
