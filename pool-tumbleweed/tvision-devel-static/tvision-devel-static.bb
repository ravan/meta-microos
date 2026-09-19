SUMMARY = "Static library for Turbo Vision 2.0"
DESCRIPTION = "This package contains the static library, headers, \
and help file compiler from the modernised Turbo \
Vision 2.0 port. \
 \
A modern port of Turbo Vision 2.0, the classical \
framework for text-based user interfaces, but with \
Unicode and cross=platform support."
LICENSE = "MIT"

PV = "0~git727"

RPM_NAME = "tvision-devel-static-0~git727-1.5.aarch64.rpm"
RPM_HASH = "4259cb823b95d0372eb125912a621d0c90a21a46dfd982449115a4be844df508e9afad86480123d025680aa9435a91583277d1bc873a35b919e13db368772b51"

RPROVIDES:${PN} += "cmake-tvision \
tvision-devel-static"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
