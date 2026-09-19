SUMMARY = "Haskell socks profiling library"
DESCRIPTION = "This package provides the Haskell socks profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-socks-prof-0.6.1-6.36.aarch64.rpm"
RPM_HASH = "4b366e739252d21607ed1428e146ff175e74121b29e876243f1f05745ebcb767e6a3cf3caf40d8293ff9007ee6e00863dc8ec1fe570f249beab2419b4905dd2d"

RPROVIDES:${PN} += "ghc-prof-socks-0.6.1-3r1HLyqOfoa8tpqI7lEsnd \
ghc-socks-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-socks-devel"

inherit rpm
