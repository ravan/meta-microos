SUMMARY = "Qt5 UI backend for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the Qt5 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwengui-qt5-79-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "8e3cbd1a47952439d596e4f506978a2a8d3542f51b3ec233db2b4963c809964c82478dab108751f2a4c64a85065e7966438394bf2aa9f0de29f8dd89925f6ec6"

RPROVIDES:${PN} += "libgwengui-qt4-0 \
libgwengui-qt5-79 \
libgwengui-qt5.so.79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgwengui-cpp.so.79 \
libgwenhywfar.so.79 \
libstdc++.so.6"

inherit rpm
