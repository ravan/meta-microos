SUMMARY = "Haskell servant profiling library"
DESCRIPTION = "This package provides the Haskell servant profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-prof-0.20.3.0-4.5.aarch64.rpm"
RPM_HASH = "dbfb6e68749be80f682be278c14e53943f17caed4af5812d54c74e3623e21adb637de7fec802988d780a9b531e526e7b7e3d27ecaf0037b59115e0373286e7af"

RPROVIDES:${PN} += "ghc-prof-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-servant-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-generics-sop-0.5.1.4-AvLlDZ30DmSAgpFaUKsIGG \
ghc-prof-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-prof-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-singleton-bool-0.1.8-HY7gfyx2MgbLc4ChWl2rDv \
ghc-prof-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-servant-devel"

inherit rpm
