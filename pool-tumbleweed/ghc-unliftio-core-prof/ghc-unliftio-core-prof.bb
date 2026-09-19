SUMMARY = "Haskell unliftio-core profiling library"
DESCRIPTION = "This package provides the Haskell unliftio-core profiling library."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-prof-0.2.1.0-3.23.aarch64.rpm"
RPM_HASH = "8653d169ff668a150912207f9d0f86d86ed64d14120d4f4d45351317d1b1edc30bad2379c30d785c6378300a4610a789ca65f652884a0d48def7b858af551e65"

RPROVIDES:${PN} += "ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-unliftio-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-unliftio-core-devel"

inherit rpm
