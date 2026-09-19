SUMMARY = "Haskell haddock-library library development files"
DESCRIPTION = "This package provides the Haskell haddock-library library development files."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-devel-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "3d1853563edb0c0c18d0201743e7698357a456019b0a39d706ed165fb1f4618a8dd8d412004d7b54b1679f3b83983411310b4aa058d1f4b28794e4a6887ef753"

RPROVIDES:${PN} += "ghc-devel-haddock-library-1.11.0-799c \
ghc-haddock-library-devel \
ghc-haddock-library-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-haddock-library"

inherit rpm
