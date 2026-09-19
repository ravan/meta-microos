SUMMARY = "Haskell typed-process library development files"
DESCRIPTION = "This package provides the Haskell typed-process library development files."
LICENSE = "MIT"

PV = "0.2.13.0"

RPM_NAME = "ghc-typed-process-devel-0.2.13.0-1.12.aarch64.rpm"
RPM_HASH = "b931852045fafec43a047294c4b26d0b1953a9a8b45fc051f5e0349028555c25a6feaf5f95b81a6de9c23dc6a147a5b7e84ccd54a126365df445801654c6bbe2"

RPROVIDES:${PN} += "ghc-devel-typed-process-0.2.13.0-Igkw9DqKpM63tp2LRi4SDw \
ghc-typed-process-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-typed-process"

inherit rpm
