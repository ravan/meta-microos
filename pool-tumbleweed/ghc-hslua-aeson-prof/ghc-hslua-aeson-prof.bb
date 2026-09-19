SUMMARY = "Haskell hslua-aeson profiling library"
DESCRIPTION = "This package provides the Haskell hslua-aeson profiling library."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-aeson-prof-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "45af58949f32a1ba8ef023b4bf3fe4316925a91eff483595104c11946ca3b6dc6df00aa974d303bb05adabfbe554a887b2acb27f5c22957a488ae9e462692f1d"

RPROVIDES:${PN} += "ghc-hslua-aeson-prof \
ghc-prof-hslua-aeson-2.3.2-2NAF9YW3ljB9EkcWLhnec"

RDEPENDS:${PN} += "ghc-hslua-aeson-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-prof-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
