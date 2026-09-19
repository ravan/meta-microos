SUMMARY = "Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmoisdn0-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "9919efc4ec845ef7886f8dcbe7390e44ceeff80f1b6b2eecda49aa619afe64839614ab742861aaddcb3f41eab9757183c5532c2147ae77eeaf7cd7513be7894a"

RPROVIDES:${PN} += "libosmoisdn.so.0 \
libosmoisdn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
