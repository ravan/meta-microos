SUMMARY = "Haskell http-client library development files"
DESCRIPTION = "This package provides the Haskell http-client library development files."
LICENSE = "MIT"

PV = "0.7.19"

RPM_NAME = "ghc-http-client-devel-0.7.19-1.19.aarch64.rpm"
RPM_HASH = "ac34f4470976792d1f3f689f69f9fc64a3b2eacfdc0f5fd14f66abe6c711551613863a347d4ea72888302c5902ab4d81df044db77146987a5ff3e4fec07145f9"

RPROVIDES:${PN} += "ghc-devel-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M \
ghc-http-client-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-devel-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-http-client"

inherit rpm
