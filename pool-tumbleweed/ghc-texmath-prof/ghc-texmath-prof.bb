SUMMARY = "Haskell texmath profiling library"
DESCRIPTION = "This package provides the Haskell texmath profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1.2"

RPM_NAME = "ghc-texmath-prof-0.13.1.2-1.3.aarch64.rpm"
RPM_HASH = "d0974b0ef98c78b0a1bf365f51fa2fa28469177e3921d14d911964c72d4a2b6edd960dd9d4059182f03e68612bd2261a800d0b17f6b84efcae817f62d4c05941"

RPROVIDES:${PN} += "ghc-prof-texmath-0.13.1.2-EtUAetkdjsPLSCg4vaSXlD \
ghc-texmath-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-prof-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-texmath-devel"

inherit rpm
