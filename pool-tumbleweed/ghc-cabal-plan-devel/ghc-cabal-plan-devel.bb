SUMMARY = "Haskell cabal-plan library development files"
DESCRIPTION = "This package provides the Haskell cabal-plan library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.6.1"

RPM_NAME = "ghc-cabal-plan-devel-0.7.6.1-1.15.aarch64.rpm"
RPM_HASH = "e9a44101372d201dacaef1f8be80d03d357ebfcfdb8cc120171d395ecc3c9948873037a743c8237ac7c9eb80aba952c1dfcbd1ad91c779d1ac53d8a492437030"

RPROVIDES:${PN} += "ghc-cabal-plan-devel \
ghc-devel-cabal-plan-0.7.6.1-FMxijykQYIFJ7ayNnBWqnC"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-plan \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-text-2.1.4-cf23"

inherit rpm
