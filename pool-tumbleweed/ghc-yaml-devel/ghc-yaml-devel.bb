SUMMARY = "Haskell yaml library development files"
DESCRIPTION = "This package provides the Haskell yaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-devel-0.11.11.2-3.23.aarch64.rpm"
RPM_HASH = "836949283a853f3c9045f77476a8bb76da7d29b8dcfd98a16fee04137e17ce366fa0c30321f661b67ebf6b25eee540a05c2b779ad5af14265314baa32d29ec98"

RPROVIDES:${PN} += "ghc-devel-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-yaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-yaml"

inherit rpm
