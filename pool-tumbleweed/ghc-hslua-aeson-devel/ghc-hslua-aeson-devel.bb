SUMMARY = "Haskell hslua-aeson library development files"
DESCRIPTION = "This package provides the Haskell hslua-aeson library development files."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-aeson-devel-2.3.2-1.2.aarch64.rpm"
RPM_HASH = "6869309a5b2dfa07f938a028fe820d018d413abae2f4bbac1b648587e8323e5b01af5ca12e4c589f9433f53da119dd546f98d09865c754b9d5442dba2cb63807"

RPROVIDES:${PN} += "ghc-devel-hslua-aeson-2.3.2-2NAF9YW3ljB9EkcWLhnec \
ghc-hslua-aeson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-hslua-core-2.3.2.1-GIcwwMIDhKVEx4MlcixfFr \
ghc-devel-hslua-marshalling-2.3.2-4wJit3DV8Bh1LNaOjZB33o \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-hslua-aeson"

inherit rpm
