SUMMARY = "Haskell byteable library development files"
DESCRIPTION = "This package provides the Haskell byteable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-devel-0.1.1-12.19.aarch64.rpm"
RPM_HASH = "7ea23c2f6c083ed0a78084d4e9d2577f6618335adff289da4d590ff0ecc791fde5ef0ae2dccfd76b83786e9ec97e71bad2b702046bf73b81650d408a71792329"

RPROVIDES:${PN} += "ghc-byteable-devel \
ghc-devel-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-byteable \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be"

inherit rpm
