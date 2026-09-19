SUMMARY = "Free DTS Coherent Acoustics decoder tools"
DESCRIPTION = "libdca is a free library for decoding DTS Coherent Acoustics \
streams. It is released under the terms of the GPL license. The DTS \
Coherent Acoustics standard is used in a variety of applications, \
including DVD, DTS audio CD and radio broadcasting. \
 \
This package contains tools for decoding DTS Coherent Acoustics \
streams."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.7+2"

RPM_NAME = "dcatools-0.0.7+2-1.13.aarch64.rpm"
RPM_HASH = "ebbd6d815e904b2bca9a011655ae8977dd85df9967b3014143f25f1b2174e2d060a85d1c193c192e5cf9f14ba61c48d489e2d182809c741d87d6bd5031d27241"

RPROVIDES:${PN} += "dcatools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdca.so.0 \
libm.so.6"

inherit rpm
