SUMMARY = "Screen gamma calibration helper"
DESCRIPTION = "Screen gamma calibration helper \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftgamma-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "76c22d6a1b8aa41049af370eb605b5b216b002d61586ab381c19bbbf3dd11d10470ca2d741a74827da21d7e00c27e32811900f19db1a9b51e14ac7f2eb0e3418"

RPROVIDES:${PN} += "ftgamma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
