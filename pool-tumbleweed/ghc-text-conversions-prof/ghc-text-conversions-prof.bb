SUMMARY = "Haskell text-conversions profiling library"
DESCRIPTION = "This package provides the Haskell text-conversions profiling library."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-prof-0.3.1.1-2.23.aarch64.rpm"
RPM_HASH = "a92d5c2b61fe9f5c7de450dfef1cfe4320aadf276bda0a2c14999354ad2db61651d5fb50b2128e403a51ad118495665fbf97ec2c8031c12be98c9929e9ef6ec0"

RPROVIDES:${PN} += "ghc-prof-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-text-conversions-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23 \
ghc-text-conversions-devel"

inherit rpm
