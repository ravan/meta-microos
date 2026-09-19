SUMMARY = "Haskell shakespeare profiling library"
DESCRIPTION = "This package provides the Haskell shakespeare profiling library."
LICENSE = "MIT"

PV = "2.1.7.1"

RPM_NAME = "ghc-shakespeare-prof-2.1.7.1-1.12.aarch64.rpm"
RPM_HASH = "96fa39e70636667a936a9d98c4240ba49bfd4fab73b9e648ccb75672cc28ee8fd1f1bece5267d41120d63eeb36a2b3d229de40726aca3e11532f73627b683a6c"

RPROVIDES:${PN} += "ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-shakespeare-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-shakespeare-devel"

inherit rpm
