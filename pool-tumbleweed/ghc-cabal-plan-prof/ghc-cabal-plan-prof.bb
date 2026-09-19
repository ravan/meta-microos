SUMMARY = "Haskell cabal-plan profiling library"
DESCRIPTION = "This package provides the Haskell cabal-plan profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.6.1"

RPM_NAME = "ghc-cabal-plan-prof-0.7.6.1-1.15.aarch64.rpm"
RPM_HASH = "10bd32bb85f53efc10b03451d8a6b37c4f672d0e8d0c986169173a4cf3aaa967d7dea0c866a1ac40134f3dc84f5a511c797f44596ed6ffd8d9b93d6bd5aaa643"

RPROVIDES:${PN} += "ghc-cabal-plan-prof \
ghc-prof-cabal-plan-0.7.6.1-FMxijykQYIFJ7ayNnBWqnC"

RDEPENDS:${PN} += "ghc-cabal-plan-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-text-2.1.4-cf23"

inherit rpm
