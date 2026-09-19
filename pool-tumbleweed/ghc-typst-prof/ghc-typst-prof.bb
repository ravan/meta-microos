SUMMARY = "Haskell typst profiling library"
DESCRIPTION = "This package provides the Haskell typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10"

RPM_NAME = "ghc-typst-prof-0.10-1.3.aarch64.rpm"
RPM_HASH = "dd28aa230645c72f570c981bc3afd32dbceb954c8489343a52bac0d319bf20aa82b2046a7bd92eb9108e5c48ecaeea7536d8cfd81b2daea7074cb4384a29adc9"

RPROVIDES:${PN} += "ghc-prof-typst-0.10-8KAGliP0h3p8xNVP0a5115 \
ghc-typst-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-ordered-containers-0.2.4-AerqY0uBw917ksiEkklhVb \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-toml-parser-2.0.2.0-5orbE5KlUlGF8qGuEq1R69 \
ghc-prof-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-prof-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-typst-devel"

inherit rpm
