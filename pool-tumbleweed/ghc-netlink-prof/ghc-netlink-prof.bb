SUMMARY = "Haskell netlink profiling library"
DESCRIPTION = "This package provides the Haskell netlink profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-prof-1.1.1.0-4.35.aarch64.rpm"
RPM_HASH = "2f17f225ceb132d9f6f121be374f0e0497974de24574e708d995b1af8b3c2457cbbf9c313086d143152e52268c3f5a09bbf434283249a3757d3def3b96b72056"

RPROVIDES:${PN} += "ghc-netlink-prof \
ghc-prof-netlink-1.1.1.0-CXOPJRLMZM2H8eJ1F7yaYv"

RDEPENDS:${PN} += "ghc-netlink-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-monad-loops-0.4.3-DnSFazqaMXyCc2HbLgcz0b \
ghc-prof-pretty-hex-1.1-9KkuISSwhPFByR4xDG3StA \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
