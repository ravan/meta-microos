SUMMARY = "Program for Converting Bitmaps to Vector Graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.10"

RPM_NAME = "autotrace-0.31.10-1.7.aarch64.rpm"
RPM_HASH = "19261a1328d663b9dd2478f01a2622956541831c10cb790ee01e8eb5042d20efbcf34d8bc17bedb71b908e01ba4b28e9aaca0f672037030b89391dc718201240"

RPROVIDES:${PN} += "autotrace \
bitmap-tracing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagickCore-7.Q16HDRI.so.10 \
libautotrace.so.3 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpng16.so.16 \
libpstoedit.so.0"

inherit rpm
