SUMMARY = "Motif Runtime Programs"
DESCRIPTION = "This package provides programs of the Motif runtime enviroment."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-2.3.8-4.7.aarch64.rpm"
RPM_HASH = "103918256b048f1940cde00fcb79eafe9a02344729a4497b92d274a33f726aa0b2d05011e20b7fa220f7b72381c653e92de6b17dfef8f12a0dd38cad5c64d43e"

RPROVIDES:${PN} += "config-motif \
motif \
openmotif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
