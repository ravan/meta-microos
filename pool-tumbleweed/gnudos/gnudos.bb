SUMMARY = "Library and utilities for DOS look-and-feel"
DESCRIPTION = "GnuDOS is a library designed to help new users of the GNU system, who are \
coming from a DOS background, fit into the picture and start using the GNU \
system with ease. It also addresses the console programmers of such programs \
that have the look and feel of old DOS system."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "gnudos-2.0-2.5.aarch64.rpm"
RPM_HASH = "0d86cd1d810b79f4d651f3d16f2f0c937f68e5c2062e44608dedabecf2c3da1f7c19ed264625bdf004672259f2626cbcf74f5a4dc630d838c9945acda0633394"

RPROVIDES:${PN} += "gnudos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
