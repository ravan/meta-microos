SUMMARY = "Haskell http-client profiling library"
DESCRIPTION = "This package provides the Haskell http-client profiling library."
LICENSE = "MIT"

PV = "0.7.19"

RPM_NAME = "ghc-http-client-prof-0.7.19-1.19.aarch64.rpm"
RPM_HASH = "86d49bf2d944fbdf052fe27d33e7f54f570adf5709657a25df234578673c72b73c13d8f24550aec7753a2112b67a3f877d05e59c499a5b69affb38d360bd1cb1"

RPROVIDES:${PN} += "ghc-http-client-prof \
ghc-prof-http-client-0.7.19-4BIOUl8FXXcE32miDzHR9M"

RDEPENDS:${PN} += "ghc-http-client-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-blaze-builder-0.4.4.1-DHhu3j9nndC9LUZIrPJCEG \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-iproute-1.7.15-E8DjYDi46DFHUJbuCQco8p \
ghc-prof-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-streaming-commons-0.2.3.1-LJ82XapHNc8JLhXXxelQgC \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
