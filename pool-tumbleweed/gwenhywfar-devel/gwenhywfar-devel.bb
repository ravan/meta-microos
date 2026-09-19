SUMMARY = "Header files for the Gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (e.g. for handling and parsing of \
configuration files, reading/writing of XML files, interprocess \
communication etc)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "gwenhywfar-devel-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "8ff520980e7cb429474ba1b9dd74f6836f8350b2a381760ccd8f726ad0ac24e32f58d06d3fa0295b358cad220c951df519c587bafda0719cb6381e14526bcc98"

RPROVIDES:${PN} += "cmake-gwengui-cpp \
cmake-gwengui-qt5 \
cmake-gwenhywfar \
gwenhywfar-devel \
pkgconfig-gwengui-fox16 \
pkgconfig-gwengui-gtk2 \
pkgconfig-gwengui-gtk3 \
pkgconfig-gwengui-qt5 \
pkgconfig-gwenhywfar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libgwengui-cpp79 \
libgwengui-fox16-79 \
libgwengui-gtk2-79 \
libgwengui-gtk3-79 \
libgwengui-qt5-79 \
libgwenhywfar79"

inherit rpm
