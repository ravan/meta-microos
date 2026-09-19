SUMMARY = "Open Object REXX libraries"
DESCRIPTION = "Library files for Open Object Rexx."
LICENSE = "CPL-1.0"

PV = "5.2.0"

RPM_NAME = "liboorexx4-5.2.0-2.1.aarch64.rpm"
RPM_HASH = "71c969af501cad630e67661f6d7820ada2a06b40c021ac32e066225f7c2160935932ab1a7a6077238fb9eb7c70468dbe3a0b6cfe5326f7724bd1d2a60acfdf89"

RPROVIDES:${PN} += "libhostemu.so.4 \
liboorexx4 \
liborxncurses.so.4 \
librexx.so.4 \
librexxapi.so.4 \
librxmath.so.4 \
librxregexp.so.4 \
librxsock.so.4 \
librxunixsys.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
