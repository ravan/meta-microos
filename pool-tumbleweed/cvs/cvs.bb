SUMMARY = "Concurrent Versions System"
DESCRIPTION = "CVS is a front-end to the rcs (Revision Control System) included in the \
standard Linux distributions. PCL-CVS, an emacs (Emacs) front-end for \
CVS, is also included."
LICENSE = "GPL-2.0-only"

PV = "1.12.13"

RPM_NAME = "cvs-1.12.13-5.4.aarch64.rpm"
RPM_HASH = "802abb265d77fcd1df6ea6a05e48b186e176233622fc0d15ce19c02141778be15d46869b03d673d9ab8766ba763ab391ed3d1ed1e2500b5fb2555894a9cac11b"

RPROVIDES:${PN} += "config-cvs \
cvs"

RDEPENDS:${PN} += "/usr/bin/csh \
/usr/bin/mktemp \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libz.so.1 \
openssh"

inherit rpm
