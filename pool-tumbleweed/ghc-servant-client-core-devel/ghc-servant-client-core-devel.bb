SUMMARY = "Haskell servant-client-core library development files"
DESCRIPTION = "This package provides the Haskell servant-client-core library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-core-devel-0.20.3.0-3.16.aarch64.rpm"
RPM_HASH = "042dc1bd8aff1c614c3ae1555f7461bd1f68ad7806a6db4986764531ec2254145a0af74bbf9ae5e2d29699e64b3d97c37f114141130f0d76f9d7e2706ab3c25d"

RPROVIDES:${PN} += "ghc-devel-servant-client-core-0.20.3.0-DaPX1t71UYQ3aIUvJX1TuT \
ghc-servant-client-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-compat-0.14.1-KqldihVKqBMDOTSpHrHMJy \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-constraints-0.14.4-7xyUtqfmnIL5WxGRWAAF5a \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-free-5.2-4eWU5ydqIMF46nGJ3OnruR \
ghc-devel-http-media-0.8.1.1-CGZiZUC7By82YjYrR6pIDk \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-servant-0.20.3.0-AuNk1SYjBzoHus6V4PFhXb \
ghc-devel-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-servant-client-core"

inherit rpm
