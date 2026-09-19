SUMMARY = "Haskell crypto-api library development files"
DESCRIPTION = "This package provides the Haskell crypto-api library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-devel-0.13.3-5.37.aarch64.rpm"
RPM_HASH = "3e2c74f891caf60e5d8f8a16ed2ec5ec444f6e34878beb4d3ad4f448990e6fa8e1d207a7acd0b70ebb05c2ddf2c5f2b02ac56a39bace49580cb83b43104f3f91"

RPROVIDES:${PN} += "ghc-crypto-api-devel \
ghc-devel-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-crypto-api \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-entropy-0.4.1.11-4UsuhibEvcjLW75DCXDx9X \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
