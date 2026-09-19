SUMMARY = "Haskell transformers library development files"
DESCRIPTION = "This package provides the Haskell transformers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-transformers-devel-0.6.3.0-1.3.aarch64.rpm"
RPM_HASH = "9190a56c27e8fe6a96618a1a30147c219a527c0696641365dcd381d66438eb264595d30c6a53ee8b4a211d8fe7b116ad2759828b3f1d30961239c41bd3ba1a76"

RPROVIDES:${PN} += "ghc-devel-transformers-0.6.3.0-4709 \
ghc-transformers-devel \
ghc-transformers-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-transformers"

inherit rpm
