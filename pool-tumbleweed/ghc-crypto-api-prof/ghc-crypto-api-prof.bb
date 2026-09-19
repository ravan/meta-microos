SUMMARY = "Haskell crypto-api profiling library"
DESCRIPTION = "This package provides the Haskell crypto-api profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-prof-0.13.3-5.37.aarch64.rpm"
RPM_HASH = "94ab912afbba6d272f9b9cc1c2f2c2f9caf0765947fef6938cb4980201f418d60b5d401ce9c8fa7f166e136f9d2e54b403f632e0fb8d02920e20e9537321e00e"

RPROVIDES:${PN} += "ghc-crypto-api-prof \
ghc-prof-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB"

RDEPENDS:${PN} += "ghc-crypto-api-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
