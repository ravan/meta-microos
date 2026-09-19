SUMMARY = "Haskell libyaml library development files"
DESCRIPTION = "This package provides the Haskell libyaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-libyaml-devel-0.1.4-2.27.aarch64.rpm"
RPM_HASH = "6264a1628ef67ec687abfa2142c99a9add25a267d95f5b0f717d80f6677b9504520f0e6e7aaec557fc7aea934cf65a238899c007c28bf8cce6a50d7abd07e79f"

RPROVIDES:${PN} += "ghc-devel-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s \
ghc-libyaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-libyaml \
pkgconfig \
pkgconfig-yaml-0.1"

inherit rpm
