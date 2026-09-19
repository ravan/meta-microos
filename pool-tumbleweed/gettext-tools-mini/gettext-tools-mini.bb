SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the `intl' library as well as tools that ease the \
creation and maintenance of message catalogs. With it you can extract \
strings from source code. The supplied Emacs mode (po-mode.el) will aid \
in editing these catalogs (called PO files, for portable object) and \
add translations. A special compiler will turn these PO files into \
binary catalogs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "gettext-tools-mini-1.0-2.4.aarch64.rpm"
RPM_HASH = "ed47468efba88da9b1d5e0818123c1643e1b8c3f210ac5fb8a10906dedac4da0b243e0a484ae57d2aede0e172f2dc54614a99b008288291ab874aea3985eeaa8"

RPROVIDES:${PN} += "gettext-devel \
gettext-tools \
gettext-tools-mini \
libgettextpo.so.0 \
libgnuintl.so.8"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
diffutils \
findutils \
gettext-runtime-mini \
glibc-gconv-modules-extra \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgettextlib-1.0.so \
libgettextsrc-1.0.so \
libgomp.so.1 \
libm.so.6 \
this-is-only-for-build-envs \
xz"

inherit rpm
