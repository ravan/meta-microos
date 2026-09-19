SUMMARY = "Haskell ghc-toolchain library development files"
DESCRIPTION = "This package provides the Haskell ghc-toolchain library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-toolchain-devel-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "3ed0a0b5437a7673c7f332f38d928e1e487c0dd72287ea22e8fcdc86d0c936d0dde1874cdc7febffdf0c96da4e3952a17c2ef2c23fec9be372500d77a68dc9ec"

RPROVIDES:${PN} += "ghc-devel-ghc-toolchain-0.1.0.0-0278 \
ghc-ghc-toolchain-devel \
ghc-ghc-toolchain-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-platform-0.1.0.0-ac24 \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-ghc-toolchain"

inherit rpm
