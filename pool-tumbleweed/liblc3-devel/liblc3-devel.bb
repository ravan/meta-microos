SUMMARY = "Low Complexity Communication Codec (LC3) - Development Files"
DESCRIPTION = "Low Complexity Communication Codec (LC3). \
The LC3 is an low latency audio codec. \
 \
This package provides all the necessary files for development with \
liblc3."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "liblc3-devel-1.1.3-1.7.aarch64.rpm"
RPM_HASH = "0dc9a468144fc55effcdc47aeddb22c0c861e5297166b2066bf5dcd4e4b649a8ee5c327a257ad2ae5615f6f01e8e270d6306ff8ba2f2d3ac0308716c48c64d6e"

RPROVIDES:${PN} += "liblc3-devel \
pkgconfig-lc3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblc3-1"

inherit rpm
