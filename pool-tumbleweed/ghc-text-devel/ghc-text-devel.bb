SUMMARY = "Haskell text library development files"
DESCRIPTION = "This package provides the Haskell text library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "ghc-text-devel-2.1.4-1.3.aarch64.rpm"
RPM_HASH = "6cb605de2839cd8ba1e0cd4660117e44c1edf1e06f5f3b5e97e50b9e71d11ca2d82893077646435f897d7d518dd352df5caad8f688b8e15ffc039e9db2d0952b"

RPROVIDES:${PN} += "ghc-devel-text-2.1.4-cf23 \
ghc-text-devel \
ghc-text-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-text"

inherit rpm
