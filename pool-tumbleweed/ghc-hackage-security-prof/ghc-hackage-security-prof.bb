SUMMARY = "Haskell hackage-security profiling library"
DESCRIPTION = "This package provides the Haskell hackage-security profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.3"

RPM_NAME = "ghc-hackage-security-prof-0.6.3.3-1.3.aarch64.rpm"
RPM_HASH = "c00965cae492d92491e3eed6dff10806101fde83bc41bab95b2f3f939edfd0ea0b38b5824acee2cbae4638865b0ba1b293ff7e1d6e4d55a0617c469b73b64781"

RPROVIDES:${PN} += "ghc-hackage-security-prof \
ghc-prof-hackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY"

RDEPENDS:${PN} += "ghc-hackage-security-devel \
ghc-prof-Cabal-syntax-3.14.2.0-5c2f \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-ed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU"

inherit rpm
