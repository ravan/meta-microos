SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "libxclass-0_9_2-0.9.2-189.10.aarch64.rpm"
RPM_HASH = "fef15ba4020ce5811010398e1629ba413edf55c8c4b9e48e73c763405000c18c53c16ed03d095c38904ad23125b97bee0bc5b1c0d7a591fd757f105845b05763"

RPROVIDES:${PN} += "libxclass-0-9-2 \
libxclass.so.0.9.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
xclass"

inherit rpm
