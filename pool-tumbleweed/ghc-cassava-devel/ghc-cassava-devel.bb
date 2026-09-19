SUMMARY = "Haskell cassava library development files"
DESCRIPTION = "This package provides the Haskell cassava library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.1"

RPM_NAME = "ghc-cassava-devel-0.5.4.1-1.11.aarch64.rpm"
RPM_HASH = "486fdc0645ac9fba585e98dd69ad8212df2d4cd5fbc7d2e1f75a2dbcaf7e0e13f1a0078668e77d95f4040fb2406bd1ecc495d0a9240a13f451f8909749d6bbbe"

RPROVIDES:${PN} += "ghc-cassava-devel \
ghc-devel-cassava-0.5.4.1-8IyxQgBHHLo5YfhT4Ar4sR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cassava \
ghc-compiler \
ghc-devel-Only-0.1-JTlBo1y3Iulx07n0z4y7 \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-short-0.1.6.1-K3gVAGEPLemvxyg6g1yq \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
