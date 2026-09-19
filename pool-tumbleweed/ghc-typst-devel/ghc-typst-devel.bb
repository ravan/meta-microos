SUMMARY = "Haskell typst library development files"
DESCRIPTION = "This package provides the Haskell typst library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10"

RPM_NAME = "ghc-typst-devel-0.10-1.3.aarch64.rpm"
RPM_HASH = "9fede32ff24c97402361bf449532b9d3661bc5f138723cf4f80c6f2a4e09cc03cfbdfbf030c36917c4bceb0b1e59ad2ccff0efad234fba7b78a81565f042619e"

RPROVIDES:${PN} += "ghc-devel-typst-0.10-8KAGliP0h3p8xNVP0a5115 \
ghc-typst-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-ordered-containers-0.2.4-AerqY0uBw917ksiEkklhVb \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-pretty-1.1.3.6-b7fd \
ghc-devel-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-toml-parser-2.0.2.0-5orbE5KlUlGF8qGuEq1R69 \
ghc-devel-typst-symbols-0.2-DAnODvBkUY47mTgQn4NVCA \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-devel-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-devel-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-typst"

inherit rpm
