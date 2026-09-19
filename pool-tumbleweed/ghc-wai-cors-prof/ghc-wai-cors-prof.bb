SUMMARY = "Haskell wai-cors profiling library"
DESCRIPTION = "This package provides the Haskell wai-cors profiling library."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-prof-0.2.7-1.36.aarch64.rpm"
RPM_HASH = "046800ba572b1a0bcbcc666c9933ef9cca4c62d834040b33aa44b749adc82ed6dec86fb746f856ecc4f0b55af053dba4e2ec6163322445d9002e554057a8e020"

RPROVIDES:${PN} += "ghc-prof-wai-cors-0.2.7-2KEC2j0rC3VACXCCYdkSR7 \
ghc-wai-cors-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-unicode-symbols-0.2.4.2-EOprbUpnIOv3U10zkWCZPk \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-cors-devel"

inherit rpm
