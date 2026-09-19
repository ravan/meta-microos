SUMMARY = "Haskell Only library development files"
DESCRIPTION = "This package provides the Haskell Only library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-devel-0.1-6.17.aarch64.rpm"
RPM_HASH = "80b7149886fb4433ab5cb7bade25a07110b7aba42c0a0fa92a4c4ee5b0b4d71db661e89433352a81e64bc51a506daf47f49bdeb34abb35f8eed0bcf160af15b1"

RPROVIDES:${PN} += "ghc-Only-devel \
ghc-devel-Only-0.1-JTlBo1y3Iulx07n0z4y7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Only \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350"

inherit rpm
