SUMMARY = "Development files for libt3widget, a terminal dialog library"
DESCRIPTION = "The libt3widget library provides a C++ dialog toolkit. It provides \
objects for dialogs and widgets like buttons, text fields, check \
boxes etc., to facilitate easy construction of dialog based programs \
for Unix-type terminals. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libt3widget."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "libt3widget-devel-1.2.2-1.15.aarch64.rpm"
RPM_HASH = "8dc7f40139b4ef18bb968c5e528c7276f7b84c2cb893b66f005aa4c8699f932d5e9772bdb6ba75a53bb9bea879a41ce768b36080221db8a2bb66993c39354db4"

RPROVIDES:${PN} += "libt3widget-devel \
pkgconfig-libt3widget"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libt3widget2 \
libxcb.so.1 \
pkgconfig-libpcre2-8 \
pkgconfig-libt3key \
pkgconfig-libt3window \
pkgconfig-libtranscript"

inherit rpm
