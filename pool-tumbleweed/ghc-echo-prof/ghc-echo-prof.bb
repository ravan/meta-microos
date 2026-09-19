SUMMARY = "Haskell echo profiling library"
DESCRIPTION = "This package provides the Haskell echo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-echo-prof-0.1.4-2.23.aarch64.rpm"
RPM_HASH = "f816214354e2809d1f3f619b6e0b33f8fc5d82e88e7d0291de8e63a2f478c29f2f4dae38a126868e7c62d2e61dff4ae4380d3802ec7446a38e2cdecf563c2144"

RPROVIDES:${PN} += "ghc-echo-prof \
ghc-prof-echo-0.1.4-2JVioXINDaCEoYt7R5FuJ9"

RDEPENDS:${PN} += "ghc-echo-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-process-1.6.26.1-905d"

inherit rpm
