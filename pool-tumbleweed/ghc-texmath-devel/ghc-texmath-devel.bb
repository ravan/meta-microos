SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1.2"

RPM_NAME = "ghc-texmath-devel-0.13.1.2-1.3.aarch64.rpm"
RPM_HASH = "3b496020743d4b76acc245775c0eab50e642a1058e9995f32e72357347cf7e988faf77e2134507f9cfa0b26e9593dbebc72f4cde47d149a8dfae028369b3d4f2"

RPROVIDES:${PN} += "ghc-devel-texmath-0.13.1.2-EtUAetkdjsPLSCg4vaSXlD \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-split-0.2.5-DF0qBqNymX3Hv5Ta0307xc \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-devel-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-texmath"

inherit rpm
