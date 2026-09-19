SUMMARY = "Haskell streaming-commons profiling library"
DESCRIPTION = "This package provides the Haskell streaming-commons profiling library."
LICENSE = "MIT"

PV = "0.2.3.1"

RPM_NAME = "ghc-streaming-commons-prof-0.2.3.1-1.8.aarch64.rpm"
RPM_HASH = "6148af22ac6592a4d4e68017d361a5f83582183be8f18b1d454ddd344a4f6817558797c14106a50746e6cd17e69d91275e66dcfc579f084dafb6e4009ddd912c"

RPROVIDES:${PN} += "ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-streaming-commons-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-zlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU \
ghc-streaming-commons-devel"

inherit rpm
