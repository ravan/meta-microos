SUMMARY = "Haskell wai profiling library"
DESCRIPTION = "This package provides the Haskell wai profiling library."
LICENSE = "MIT"

PV = "3.2.4"

RPM_NAME = "ghc-wai-prof-3.2.4-1.26.aarch64.rpm"
RPM_HASH = "64ec0b3ae453951304d22d8c84251ca86500763e483f821930f31ee25a31861f982a6d4290d80513b3d7e0510a6a1ab68a88321ba2ecaae42948f1bcfeec4c88"

RPROVIDES:${PN} += "ghc-prof-wai-3.2.4-Is1UVC1czjX2cAufnl3tJW \
ghc-wai-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-vault-0.3.2.0-GYOqPpJA2DW5Qz2IFtkvei \
ghc-wai-devel"

inherit rpm
