SUMMARY = "Haskell servant-client-core profiling library"
DESCRIPTION = "This package provides the Haskell servant-client-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-core-prof-0.20.3.0-3.16.aarch64.rpm"
RPM_HASH = "61a4a186d88f094d2db714d86b485495846cefea62d009d217e2a80d8c58a1f979a37a96f58e48e914d76e9189f2d13aa3f801a15e4cd426ea1696fb2f431ddf"

RPROVIDES:${PN} += "ghc-prof-servant-client-core-0.20.3.0-DaPX1t71UYQ3aIUvJX1TuT \
ghc-servant-client-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-prof-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-prof-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-servant-client-core-devel"

inherit rpm
