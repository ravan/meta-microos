SUMMARY = "Haskell base64-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base64-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-prof-1.2.1.0-3.30.aarch64.rpm"
RPM_HASH = "8af80662c77e0435231a0610dff7b1f27ab9bdd30da9933e0d5a4a7e1e4ff6062939b92bae9100700f11dfb0429dc178238e4c59c8ba97fd92862de0e8dfe8e6"

RPROVIDES:${PN} += "ghc-base64-bytestring-prof \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y"

RDEPENDS:${PN} += "ghc-base64-bytestring-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
