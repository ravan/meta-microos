SUMMARY = "Tools for Native Language Support (NLS)"
DESCRIPTION = "This package contains the `intl' library as well as tools that ease the \
creation and maintenance of message catalogs. With it you can extract \
strings from source code. The supplied Emacs mode (po-mode.el) will aid \
in editing these catalogs (called PO files, for portable object) and \
add translations. A special compiler will turn these PO files into \
binary catalogs."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0"

RPM_NAME = "gettext-tools-1.0-2.4.aarch64.rpm"
RPM_HASH = "91736b63c58b324daccc35c5ea9d673410dd5b9ec5151b1179aafd0f46d11609aab731b328be12bfd5ab19276beb608c749f5f437414e0ae87fb34d0a6527550"

RPROVIDES:${PN} += "gettext-devel \
gettext-tools \
libgettextpo.so.0 \
libgnuintl.so.8"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
diffutils \
findutils \
gettext-runtime \
glibc-gconv-modules-extra \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgettextlib-1.0.so \
libgettextsrc-1.0.so \
libgomp.so.1 \
libm.so.6 \
libtextstyle.so.0 \
libxml2.so.16 \
xz"

inherit rpm
