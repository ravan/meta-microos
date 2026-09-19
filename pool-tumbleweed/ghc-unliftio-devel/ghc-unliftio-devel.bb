SUMMARY = "Haskell unliftio library development files"
DESCRIPTION = "This package provides the Haskell unliftio library development files."
LICENSE = "MIT"

PV = "0.2.25.1"

RPM_NAME = "ghc-unliftio-devel-0.2.25.1-1.12.aarch64.rpm"
RPM_HASH = "0ac1cbdea66df4a6e62239ebd8d2dd5b33f79a67373abb688a350f7bd1a888ae8292b07c9488bad6fce5e110791d4dd8a213d46060ed3932ff541390f0d60187"

RPROVIDES:${PN} += "ghc-devel-unliftio-0.2.25.1-8vIVLEQRNyE8ysD18Y7w9V \
ghc-unliftio-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-safe-exceptions-0.1.7.4-JhYHKGOjni2BPgULQnbuUS \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-unliftio"

inherit rpm
