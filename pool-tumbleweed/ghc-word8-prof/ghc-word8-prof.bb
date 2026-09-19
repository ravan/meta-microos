SUMMARY = "Haskell word8 profiling library"
DESCRIPTION = "This package provides the Haskell word8 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-prof-0.1.3-5.35.aarch64.rpm"
RPM_HASH = "f098cd5d3aaee1a420fa6701afa4929d0ca263f9ed1898111dc3591d1932fad19acbcd91f2a9fabb1389c86e4e37499356dae1dc88291a88d1696eb1034ac653"

RPROVIDES:${PN} += "ghc-prof-word8-0.1.3-DJye6up9iU5LN32ihJcMva \
ghc-word8-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-word8-devel"

inherit rpm
