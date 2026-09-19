SUMMARY = "Haskell attoparsec library development files"
DESCRIPTION = "This package provides the Haskell attoparsec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-devel-0.14.4-6.19.aarch64.rpm"
RPM_HASH = "520cb74b7c7be19f8416827e4d85e33507c8bb3e6e412694455fae542efb93abd01ed4a2ecba160b60a3a8cf3ebfe24cecfaf1d4bd618b4d7d4196c819594000"

RPROVIDES:${PN} += "ghc-attoparsec-devel \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-attoparsec \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
