SUMMARY = "Haskell splitmix library development files"
DESCRIPTION = "This package provides the Haskell splitmix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3.2"

RPM_NAME = "ghc-splitmix-devel-0.1.3.2-1.3.aarch64.rpm"
RPM_HASH = "6c87675fa64ecc7a08512bdb37e67d1f26efa98384c153e5459f65f13940dd41e92e1b7ec0c4401772c95b7698e54db0de7a599449bb5229748f6a171c159d51"

RPROVIDES:${PN} += "ghc-devel-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-splitmix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-splitmix"

inherit rpm
