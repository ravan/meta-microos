SUMMARY = "A Program to View PostScript Files"
DESCRIPTION = "GV offers you an X Window System GUI for viewing PostScript files. This \
is an X Window System interface to ghostscript. \
 \
 \
 \
Authors: \
-------- \
    Tim Theisen <tim@cs.wisc.edu> \
    Johannes Plass <plass@dipmza.physik.uni-mainz.de>"
LICENSE = "GPL-3.0-or-later"

PV = "3.7.4"

RPM_NAME = "gv-3.7.4-7.12.aarch64.rpm"
RPM_HASH = "ce49130503e3cb5aeed27f8fe909efeeffb104a7470900bcebc9bb6be4261fc761a9c2c9e183c75b410e484bd1eef3559cb91ea0e2c1fa07c3c792ee67841208"

RPROVIDES:${PN} += "config-gv \
gv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ghostscript-x11 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXinerama.so.1 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libzio.so.1"

inherit rpm
