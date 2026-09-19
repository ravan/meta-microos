SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the intl library as well as tools that ease the \
creation and maintenance of message catalogs. It allows you to extract \
strings from source code. The supplied Emacs mode (po-mode.el) helps \
editing these catalogs (called PO files, for portable object) and \
adding translations. A special compiler turns these PO files into \
binary catalogs."
LICENSE = "GPL-3.0-or-later & LGPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "gettext-runtime-mini-1.0-2.4.aarch64.rpm"
RPM_HASH = "bc547a6cfb3ce5afa283637b009a9e26d2002b3487ac7bbb406915a09474a539270423b40fa6960d0415e1b19964130c213d6704f2c4bad183da4b5f0707592f"

RPROVIDES:${PN} += "gettext-runtime \
gettext-runtime-mini \
libasprintf.so.0 \
libgettextlib-1.0.so \
libgettextsrc-1.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
envsubst-mini \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
this-is-only-for-build-envs"

inherit rpm
