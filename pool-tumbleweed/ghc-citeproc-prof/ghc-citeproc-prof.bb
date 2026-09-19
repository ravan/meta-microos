SUMMARY = "Haskell citeproc profiling library"
DESCRIPTION = "This package provides the Haskell citeproc profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.13.0.1"

RPM_NAME = "ghc-citeproc-prof-0.13.0.1-1.3.aarch64.rpm"
RPM_HASH = "441639062e86f4de1fe16a357e2ada38c9a54fe6fe3c1f41dd86254232b1d83919474c6184a72d153b0840d4c4af4944d4ef60f53f5e1ad272e1e1e96b867545"

RPROVIDES:${PN} += "ghc-citeproc-prof \
ghc-prof-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS"

RDEPENDS:${PN} += "ghc-citeproc-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-prof-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4"

inherit rpm
