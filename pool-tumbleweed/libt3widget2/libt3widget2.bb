SUMMARY = "The Tilde terminal dialog toolkit"
DESCRIPTION = "The libt3widget library provides a C++ dialog toolkit. It provides \
objects for dialogs and widgets like buttons, text fields, check \
boxes etc., to facilitate easy construction of dialog based programs \
for Unix-type terminals."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "libt3widget2-1.2.2-1.15.aarch64.rpm"
RPM_HASH = "375411bfd03e65e665ab3fa4fb28077c90f7394bccdae99b6584d361ad88c0223e8ce21a5a43b05465093a5447f8ea0574bc543a1bfc303807917efb2f78ab47"

RPROVIDES:${PN} += "libt3widget.so.2 \
libt3widget2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgpm.so.2 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libt3key.so.1 \
libt3window.so.0 \
libtranscript.so.1 \
libunistring.so.5"

inherit rpm
