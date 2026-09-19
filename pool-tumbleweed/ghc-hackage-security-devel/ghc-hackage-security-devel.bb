SUMMARY = "Haskell hackage-security library development files"
DESCRIPTION = "This package provides the Haskell hackage-security library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.3"

RPM_NAME = "ghc-hackage-security-devel-0.6.3.3-1.3.aarch64.rpm"
RPM_HASH = "8486a7918e3fac353a29a6dd5d7510a183193116a20b1e03488f3c76e55ad91a25b8f107d6050d9f38a724d8d48e7f5a2698af537d45ff35d2132948a7211e31"

RPROVIDES:${PN} += "ghc-devel-hackage-security-0.6.3.3-Jje472K7snZBc2J1CzQQlY \
ghc-hackage-security-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-syntax-3.14.2.0-5c2f \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-ed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-tar-0.6.4.0-9ossRFyAR7eA6S8nUFxzyG \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-hackage-security"

inherit rpm
