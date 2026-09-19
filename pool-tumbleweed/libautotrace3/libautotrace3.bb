SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.10"

RPM_NAME = "libautotrace3-0.31.10-1.7.aarch64.rpm"
RPM_HASH = "6044407fa3c1125eed21fcb1046e0402edec92345c92441962b6b22fa9cc01e1d7e9d596683b570c57715b5e4bb9ede72082116f7d5e1e20e7a6c05cdf39b593"

RPROVIDES:${PN} += "libautotrace.so.3 \
libautotrace3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
