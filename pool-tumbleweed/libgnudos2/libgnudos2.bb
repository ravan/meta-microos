SUMMARY = "Library for DOS look-and-feel"
DESCRIPTION = "GnuDOS is a library designed to help new users of the GNU system, who are \
coming from a DOS background, fit into the picture and start using the GNU \
system with ease. It also addresses the console programmers of such programs \
that have the look and feel of old DOS system. \
 \
This package contains the libgnudos2 shared library."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "libgnudos2-2.0-2.5.aarch64.rpm"
RPM_HASH = "fe8762b6f9cfb58777d8998877036e845b97257649a8741b6192df3d631e0832d3e5792282209fadc2a6368f86b70bf3dea027da0810b1cc2a0d5ef55b82289b"

RPROVIDES:${PN} += "libgnudos.so.2 \
libgnudos2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
