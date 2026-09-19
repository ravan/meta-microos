SUMMARY = "Haskell singleton-bool profiling library"
DESCRIPTION = "This package provides the Haskell singleton-bool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-singleton-bool-prof-0.1.8-3.2.aarch64.rpm"
RPM_HASH = "83f61eb963d936d8568294ed0f6a35457ecf9c1a71076b2a37e27435ac75fcaf8090b53fb499dd5ce532c67f4c741db092fc775298ae55168b5c46bc35c0a84d"

RPROVIDES:${PN} += "ghc-prof-singleton-bool-0.1.8-HY7gfyx2MgbLc4ChWl2rDv \
ghc-singleton-bool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw \
ghc-prof-dec-0.0.6-9n55jO9wFkCDcYlO4DYA9w \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-some-1.0.6-8u6QsVxyLEPKKVYkZL0j6j \
ghc-singleton-bool-devel"

inherit rpm
