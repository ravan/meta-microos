SUMMARY = "Haskell yaml profiling library"
DESCRIPTION = "This package provides the Haskell yaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-prof-0.11.11.2-3.23.aarch64.rpm"
RPM_HASH = "278aa92728ca2e383bb456b8403a36ff78a02464929c6d379fd1a0bb7de7381bfbc643f06d5c0c705d6728f50be3190acd8708a741dea595ddd95acdc1cded1c"

RPROVIDES:${PN} += "ghc-prof-yaml-0.11.11.2-DNw228htw8L33w1OC1EWSt \
ghc-yaml-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-libyaml-0.1.4-E4bvPREJvp6KOHEKYnSP5s \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-yaml-devel"

inherit rpm
