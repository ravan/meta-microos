SUMMARY = "Haskell citeproc library development files"
DESCRIPTION = "This package provides the Haskell citeproc library development files."
LICENSE = "BSD-2-Clause"

PV = "0.13.0.1"

RPM_NAME = "ghc-citeproc-devel-0.13.0.1-1.3.aarch64.rpm"
RPM_HASH = "5688772e2ae6464e4efc5eb957b4d862e511bc75a4a3705d1db7b2d88c4a11fa19d79cd3014a64acedb5e918e8175c5fdaa34a1b0544f1014c6902b485abf848"

RPROVIDES:${PN} += "ghc-citeproc-devel \
ghc-devel-citeproc-0.13.0.1-Ccf9E6t5yTGAMbIo1yftDS"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-citeproc \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-devel-uniplate-1.6.13-FhUIjk7rCCk8dCOMm0dejl \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4"

inherit rpm
