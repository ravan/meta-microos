SUMMARY = "Haskell HTTP profiling library"
DESCRIPTION = "This package provides the Haskell HTTP profiling library."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-prof-4000.4.1-5.11.aarch64.rpm"
RPM_HASH = "e9fb5feed6c8a5f10213658dfd077b7d8d0c234f5310f69b34e1ff3239a2be1157b69474fdc8898f0dccc02560a08c93bb1720228e0609defaa9dc750454a217"

RPROVIDES:${PN} += "ghc-HTTP-prof \
ghc-prof-HTTP-4000.4.1-G8VuDcYxUIH9Vk3NDIhhHx"

RDEPENDS:${PN} += "ghc-HTTP-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
