SUMMARY = "Haskell typed-process profiling library"
DESCRIPTION = "This package provides the Haskell typed-process profiling library."
LICENSE = "MIT"

PV = "0.2.13.0"

RPM_NAME = "ghc-typed-process-prof-0.2.13.0-1.12.aarch64.rpm"
RPM_HASH = "10423773f5b09797b83e463c697c58359ad6c6eef4c7d61f1a54b88de757836cb55cdfb5323511601ab9276796af1caf278ea817ffa7fd6acea2315800738b2d"

RPROVIDES:${PN} += "ghc-prof-typed-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw \
ghc-typed-process-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-typed-process-devel"

inherit rpm
