SUMMARY = "Haskell attoparsec profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-prof-0.14.4-6.19.aarch64.rpm"
RPM_HASH = "984eaa87c375a91684126c4e71511c813775e8f7b999d8c58db09a0cee112fc3ce02d155d9adf0008907e96274a237241bc71879639e4ffb0a534f1501520eac"

RPROVIDES:${PN} += "ghc-attoparsec-prof \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7"

RDEPENDS:${PN} += "ghc-attoparsec-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
