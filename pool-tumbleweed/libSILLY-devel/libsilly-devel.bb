SUMMARY = "Simple Image Loading LibrarY development package"
DESCRIPTION = "Development files for libSILLY \
SILLY means Simple Image Loading LibrarY. The aim of this library is to provide \
a simple library for loading image in the context of CEGUI. The library supports \
only the most common image format. The project was initially launch in order \
to provide an MIT based replacement of DevIL with less image format supported \
and focused on loading image only."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libSILLY-devel-0.1.0-2.11.aarch64.rpm"
RPM_HASH = "9afa607ba32605698e17d6f190f42aad9c8fb37c9b353b52b34851796e6fccf2d63548d3de373f7e099552a7e79b3551e946db46a937237abb220568608a0700"

RPROVIDES:${PN} += "libSILLY-devel \
pkgconfig-SILLY"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSILLY1"

inherit rpm
