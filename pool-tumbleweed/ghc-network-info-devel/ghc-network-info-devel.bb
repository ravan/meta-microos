SUMMARY = "Haskell network-info library development files"
DESCRIPTION = "This package provides the Haskell network-info library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-devel-0.2.1-2.21.aarch64.rpm"
RPM_HASH = "1e9be4529f5694d6bfb0104e3bb9fc131cb8612e0f8a865c3d1b9a2dc9bf47c17d0b245387150300142a0787308c5d7cf1996abb2697569d802ec0474a6c571d"

RPROVIDES:${PN} += "ghc-devel-network-info-0.2.1-I1lcnyergC0DdfN7xa3e0a \
ghc-network-info-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-network-info"

inherit rpm
