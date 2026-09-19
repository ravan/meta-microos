SUMMARY = "Haskell integer-logarithms profiling library"
DESCRIPTION = "This package provides the Haskell integer-logarithms profiling library."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "ghc-integer-logarithms-prof-1.0.5-1.3.aarch64.rpm"
RPM_HASH = "76686a825a9b02f2e0f3d7c03662b2e01c1c94eb1fc69cb126c4bbfc4cf1d39d008f379769e34be256b589c5b3d860754e9de22bc9123e6f846a3c3cab53d5a9"

RPROVIDES:${PN} += "ghc-integer-logarithms-prof \
ghc-prof-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2"

RDEPENDS:${PN} += "ghc-integer-logarithms-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
