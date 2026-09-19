SUMMARY = "Haskell streaming-commons library development files"
DESCRIPTION = "This package provides the Haskell streaming-commons library development \
files."
LICENSE = "MIT"

PV = "0.2.3.1"

RPM_NAME = "ghc-streaming-commons-devel-0.2.3.1-1.8.aarch64.rpm"
RPM_HASH = "f0dbd9eea7bfb64925c174c909140766e4230a0c9274c010e474840e321c6be119017f1b42b903f64f0206607ac354f11a8f367ae291bac32f7b2775ba50b17b"

RPROVIDES:${PN} += "ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-streaming-commons-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-streaming-commons"

inherit rpm
