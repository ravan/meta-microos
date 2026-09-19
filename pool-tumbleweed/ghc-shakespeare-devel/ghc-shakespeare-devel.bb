SUMMARY = "Haskell shakespeare library development files"
DESCRIPTION = "This package provides the Haskell shakespeare library development files."
LICENSE = "MIT"

PV = "2.1.7.1"

RPM_NAME = "ghc-shakespeare-devel-2.1.7.1-1.12.aarch64.rpm"
RPM_HASH = "8fd615cd602e370fe5829aa0cf98ea2ea25a4727dace311d0dd4139b7d600f7b691485ddb835f7e04341814d6d4f401db6aee168b14866655a948e4acf9f27ac"

RPROVIDES:${PN} += "ghc-devel-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-shakespeare-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-devel-blaze-markup-0.8.3.0-K4FwMBPUUgu9TB66ALCxf7 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-file-embed-0.0.16.0-JqsWezc6wrB9rh480YKWnn \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-shakespeare"

inherit rpm
