SUMMARY = "Haskell regex-posix profiling library"
DESCRIPTION = "This package provides the Haskell regex-posix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.2"

RPM_NAME = "ghc-regex-posix-prof-0.96.0.2-1.12.aarch64.rpm"
RPM_HASH = "f670769089ec1cdbb3aef64268a2cf995a581c7f63607283263e1b81cc61a6bbac2bccd3c04028f60e29fcad9e15bfc8af3a01d42fb3e27c45099e9978fbd879"

RPROVIDES:${PN} += "ghc-prof-regex-posix-0.96.0.2-ChZqQGTfEDW3V6S9qgLypS \
ghc-regex-posix-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-regex-posix-devel"

inherit rpm
