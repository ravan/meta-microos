SUMMARY = "A 2D-Plot-Program for Visualisation of Scientific Data"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. \
 \
For examples, see /usr/lib/xmgrace/examples."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-5.1.25-7.7.aarch64.rpm"
RPM_HASH = "41e434b798b0c001807e520cd9c59e1921e3b9cf133b5451dea285744aa617f1f29846bd1305a97bafbe22d597a37ffcc4d2f9dca5975c2dfc1252c799c6737e"

RPROVIDES:${PN} += "xmgrace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm
