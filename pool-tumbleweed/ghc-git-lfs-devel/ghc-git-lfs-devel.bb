SUMMARY = "Haskell git-lfs library development files"
DESCRIPTION = "This package provides the Haskell git-lfs library development files."
LICENSE = "AGPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "ghc-git-lfs-devel-1.2.5-1.21.aarch64.rpm"
RPM_HASH = "4d0a8682bd7362f78e2312e7ae5faa6c9c64b3f2f166e5dc000d4edfd502cfcb405fc6c26f5077e52c5a4662ae66d0694212858265f86ec91f17dcfd017acc83"

RPROVIDES:${PN} += "ghc-devel-git-lfs-1.2.5-8WcY5uZaI2JDmRBdOndIrj \
ghc-git-lfs-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-text-2.1.4-cf23 \
ghc-git-lfs"

inherit rpm
