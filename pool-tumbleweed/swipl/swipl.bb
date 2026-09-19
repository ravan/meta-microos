SUMMARY = "Prolog Compiler"
DESCRIPTION = "Edinburgh-style Prolog compiler including modules, autoload, libraries, \
Garbage collector, stack expandor, C interface, GNU readline and GNU \
Emacs interface, a very fast compiler,and an X11 interface using XPCE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.1.14"

RPM_NAME = "swipl-10.1.14-1.1.aarch64.rpm"
RPM_HASH = "1256fa4276019f3e7af7618592edbd5c3483f7ac4e1ea6d220ab5086b68bfb4a46b0cf0d0e0af7ff54b2fba98ee75ed623ee6929682949ec5d48402c6a15f4b3"

RPROVIDES:${PN} += "cmake-SWIPL \
libedit4pl.so \
libjpl.so \
libswipl.so.10 \
pkgconfig-swipl \
swi-pl \
swi-prolog \
swipl"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libdb-4.8.so \
libedit.so.0 \
libgmp.so.10 \
libjvm.so \
libm.so.6 \
libodbc.so.2 \
libossp-uuid.so.16 \
libpython3.13.so.1.0 \
libssl.so.3 \
libtcmalloc-minimal.so.4 \
libtinfo.so.6 \
libutf8proc.so.3 \
libyaml-0.so.2 \
libz.so.1"

inherit rpm
