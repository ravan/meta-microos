SUMMARY = "Motif runtime library"
DESCRIPTION = "This package provides the main Motif shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libXm4-2.3.8-4.7.aarch64.rpm"
RPM_HASH = "1afb275906016139eeddd96b7e8fdf6223855d54ff2a9b63bc55cef0b5deb516be4360c8cc9a36def9156c66713b60004320ff991931c2d0c0e51582dcf6fb9b"

RPROVIDES:${PN} += "libXm.so.4 \
libXm4 \
openmotif-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXp.so.6 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
