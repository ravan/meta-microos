SUMMARY = "Haskell servant library development files"
DESCRIPTION = "This package provides the Haskell servant library development files."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-devel-0.20.3.0-4.5.aarch64.rpm"
RPM_HASH = "0e4fd4e9d8bb2af7821fac68ab1f707dc9015a2c0c833c96b5444afbb24177159476baaa2633f1b9448e17556d20e365d99bfe73fe32704d49118ec87826e08c"

RPROVIDES:${PN} += "ghc-devel-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-servant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-generics-sop-0.5.1.4-AvLlDZ30DmSAgpFaUKsIGG \
ghc-devel-http-api-data-0.6.3-I1ef71ZD4mvBWZMbbifsIw \
ghc-devel-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-singleton-bool-0.1.8-HY7gfyx2MgbLc4ChWl2rDv \
ghc-devel-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-servant"

inherit rpm
