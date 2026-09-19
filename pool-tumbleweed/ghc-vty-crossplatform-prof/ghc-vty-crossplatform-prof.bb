SUMMARY = "Haskell vty-crossplatform profiling library"
DESCRIPTION = "This package provides the Haskell vty-crossplatform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-vty-crossplatform-prof-0.4.0.0-1.43.aarch64.rpm"
RPM_HASH = "05841c5a53a17d3201e0093f9d46034171fe4db97bc21cbd2cb0957e7a35d5aea1c5071dbb0bc17af0f892a2555c383bf99999da4251890d0f554b56c8667aac"

RPROVIDES:${PN} += "ghc-prof-vty-crossplatform-0.4.0.0-DfPElrORw2a1ydk7gC4Op8 \
ghc-vty-crossplatform-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-vty-6.6-EPyV4ZsVRx8EnXBLhcE4eO \
ghc-prof-vty-unix-0.3.0.0-BdEZXN0VRxZI5S5J9qgVGK \
ghc-vty-crossplatform-devel"

inherit rpm
