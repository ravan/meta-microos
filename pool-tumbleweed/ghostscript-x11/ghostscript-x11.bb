SUMMARY = "X11 library for Ghostscript"
DESCRIPTION = "This package contains the X11 library which is needed to view PostScript and \
PDF files with Ghostscript under the X Window System."
LICENSE = "AGPL-3.0-only"

PV = "10.07.1"

RPM_NAME = "ghostscript-x11-10.07.1-1.3.aarch64.rpm"
RPM_HASH = "6e83728b25c26cb82bdf8be04f187953e96dce03a5a5b2f59fdecec6fc188f9ec144d9182a168688448285acd56c45b8367e02ccd85f61f484acf0a47f8ce974"

RPROVIDES:${PN} += "ghostscript-x11"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXext.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
