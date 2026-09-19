SUMMARY = "Haskell network-multicast library development files"
DESCRIPTION = "This package provides the Haskell network-multicast library development \
files."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-devel-0.3.2-4.24.aarch64.rpm"
RPM_HASH = "a8ada2d16e6b1c3b55303aaa3fc4d1998eab1fed8343215bc52b28e840debb00ab6580b1f3ec1058f3f27dc64081e21ce7dad3fa69a491b2b25fb0814e3d5039"

RPROVIDES:${PN} += "ghc-devel-network-multicast-0.3.2-DqSeOq9jAwXGqsSQlqcI6u \
ghc-network-multicast-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-bsd-2.8.1.0-Eim1HbjRi8aBvcsvglmxNx \
ghc-network-multicast"

inherit rpm
