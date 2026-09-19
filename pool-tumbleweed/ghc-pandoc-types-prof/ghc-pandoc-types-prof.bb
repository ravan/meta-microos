SUMMARY = "Haskell pandoc-types profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-types profiling library."
LICENSE = "GPL-2.0-only"

PV = "1.23.1.2"

RPM_NAME = "ghc-pandoc-types-prof-1.23.1.2-1.3.aarch64.rpm"
RPM_HASH = "53975fc3321fb8b1713815942b9a86b30e273259cc8c7051a475036b160af927ac02fe68c2b1fa40d4eef94df06a253956be502fee4cbbf60483ef019086639d"

RPROVIDES:${PN} += "ghc-pandoc-types-prof \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65"

RDEPENDS:${PN} += "ghc-pandoc-types-devel \
ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-syb-0.7.4-6fi78MDXPhtHdqjdF3SBYJ \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
