SUMMARY = "Haskell pandoc-types library development files"
DESCRIPTION = "This package provides the Haskell pandoc-types library development files."
LICENSE = "GPL-2.0-only"

PV = "1.23.1.2"

RPM_NAME = "ghc-pandoc-types-devel-1.23.1.2-1.3.aarch64.rpm"
RPM_HASH = "e954fef17242465635e62eeb21a2b780f555fa8e004918d93976ab1e8f81d8f88cc7870c116db6b7c69f41a88602aaca226ba97413768d6533647b480de7c1c3"

RPROVIDES:${PN} += "ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-pandoc-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-pandoc-types"

inherit rpm
