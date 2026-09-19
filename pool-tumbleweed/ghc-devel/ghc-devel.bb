SUMMARY = "GHC development libraries meta package"
DESCRIPTION = "This is a meta-package for all the development library packages in GHC \
except the ghc library, which is installed by the toplevel ghc metapackage."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-devel-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "d0f55a08fd8c835e7a4ec40a7116342e2fcebf5934ddb650d7c016912ced65179204b06b385dd4b003d0d844359058845c87c496bb89dd03ee9a033acc1fb06c"

RPROVIDES:${PN} += "ghc-devel \
ghc-libraries"

RDEPENDS:${PN} += "ghc-Cabal-devel \
ghc-Cabal-syntax-devel \
ghc-array-devel \
ghc-base-devel \
ghc-binary-devel \
ghc-bytestring-devel \
ghc-compiler \
ghc-containers-devel \
ghc-deepseq-devel \
ghc-directory-devel \
ghc-exceptions-devel \
ghc-file-io-devel \
ghc-filepath-devel \
ghc-ghc-boot-th-devel \
ghc-ghc-experimental-devel \
ghc-ghc-internal-devel \
ghc-ghc-platform-devel \
ghc-ghc-toolchain-devel \
ghc-haddock-api-devel \
ghc-haddock-library-devel \
ghc-haskeline-devel \
ghc-mtl-devel \
ghc-os-string-devel \
ghc-parsec-devel \
ghc-pretty-devel \
ghc-process-devel \
ghc-semaphore-compat-devel \
ghc-stm-devel \
ghc-template-haskell-devel \
ghc-terminfo-devel \
ghc-text-devel \
ghc-time-devel \
ghc-transformers-devel \
ghc-unix-devel \
ghc-xhtml-devel"

inherit rpm
