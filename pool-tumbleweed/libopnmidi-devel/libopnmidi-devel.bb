SUMMARY = "Header files for libOPNMIDI"
DESCRIPTION = "Development and header files for libOPNMIDI."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.6.2"

RPM_NAME = "libopnmidi-devel-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "8602f0ff5b937eeaa65aea54cd50521cf611dc350a7c2bfb1f48b76960bdccdeb15bdfe1595a71b2d088a9e195fdc95d691e2da010b0874a2c15a113e3fa03b0"

RPROVIDES:${PN} += "cmake-libOPNMIDI \
libopnmidi-devel \
pkgconfig-libOPNMIDI"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOPNMIDI1"

inherit rpm
