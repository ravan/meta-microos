SUMMARY = "Haskell wai-cors library development files"
DESCRIPTION = "This package provides the Haskell wai-cors library development files."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-devel-0.2.7-1.36.aarch64.rpm"
RPM_HASH = "122d1ee701b7362d344df6853028685911bf77ce5c25f0f48c4cc569a33f4f279d27b70b86a09443c651cb0d9fceff03d5263b40b5c673e52cbe37b2e4bf9a55"

RPROVIDES:${PN} += "ghc-devel-wai-cors-0.2.7-2KEC2j0rC3VACXCCYdkSR7 \
ghc-wai-cors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-unicode-symbols-0.2.4.2-EOprbUpnIOv3U10zkWCZPk \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-cors"

inherit rpm
