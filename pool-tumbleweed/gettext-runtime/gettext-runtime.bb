SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the intl library as well as tools that ease the \
creation and maintenance of message catalogs. It allows you to extract \
strings from source code. The supplied Emacs mode (po-mode.el) helps \
editing these catalogs (called PO files, for portable object) and \
adding translations. A special compiler turns these PO files into \
binary catalogs."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "gettext-runtime-1.0-2.4.aarch64.rpm"
RPM_HASH = "cb4c3f99007c9e4ec51d805fe79208497b5c4e47e8c17992f83c6abcd8b96a3092f42098f295f5a0ebbcb2594a416717adad3d3b2d742db95436d89b55c10bdb"

RPROVIDES:${PN} += "gettext \
gettext-runtime \
libasprintf.so.0 \
libgettextlib-1.0.so \
libgettextsrc-1.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
envsubst \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libattr.so.1 \
libc.so.6 \
libm.so.6 \
libselinux.so.1 \
libstdc++.so.6 \
libtextstyle.so.0 \
libxml2.so.16"

inherit rpm
