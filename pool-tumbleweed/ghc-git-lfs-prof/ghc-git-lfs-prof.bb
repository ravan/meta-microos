SUMMARY = "Haskell git-lfs profiling library"
DESCRIPTION = "This package provides the Haskell git-lfs profiling library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "ghc-git-lfs-prof-1.2.5-1.21.aarch64.rpm"
RPM_HASH = "9ab3080f53e73deaf0b79c09f5c2ff79c26e64162eb552124c642aa5c21eff6b3dc3e8c06588f4b722be70b6ca4222a1836940061dc261286a7b2a4ca8da42ff"

RPROVIDES:${PN} += "ghc-git-lfs-prof \
ghc-prof-git-lfs-1.2.5-8WcY5uZaI2JDmRBdOndIrj"

RDEPENDS:${PN} += "ghc-git-lfs-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
