SUMMARY = "Haskell parsec library development files"
DESCRIPTION = "This package provides the Haskell parsec library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.18.0"

RPM_NAME = "ghc-parsec-devel-3.1.18.0-1.3.aarch64.rpm"
RPM_HASH = "d57ee54539b8a71a03681116c9c55dabcc64c37bc0fd42024d82e8cb23667d45a653bdfffb062e786fcc1eae119e6a8cbcbde0fc5e2c70d51a6a5b35fa553234"

RPROVIDES:${PN} += "ghc-devel-parsec-3.1.18.0-be05 \
ghc-parsec-devel \
ghc-parsec-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-text-2.1.4-cf23 \
ghc-parsec"

inherit rpm
