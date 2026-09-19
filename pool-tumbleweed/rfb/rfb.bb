SUMMARY = "heXoNet RFB (remote control for the X Window System)"
DESCRIPTION = "The heXoNet RFB Software package includes many different projects. The \
goal of this package is to provide a comprehensive collection of \
rfb-enabled tools and applications. One application, x0rfbserver, was, \
and maybe still is, the only complete remote control solution for the X \
Window System."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "rfb-0.6.1-703.22.aarch64.rpm"
RPM_HASH = "867fa67a828db2c2ee362404350ec83a4af5cc673b5ceef7ed9f89b875574c6d908a6f4adafd86c1760f2e6e4c95c30c1d472f0039e186dcd806ad4fa0553d02"

RPROVIDES:${PN} += "rfb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxclass.so.0.9.2 \
libz.so.1 \
xclass"

inherit rpm
