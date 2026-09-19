SUMMARY = "Haskell dec library development files"
DESCRIPTION = "This package provides the Haskell dec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.6"

RPM_NAME = "ghc-dec-devel-0.0.6-3.2.aarch64.rpm"
RPM_HASH = "a43ce2608ef8479610386967913996ac22d4abee7061065b8792a02510ca3dd62112dc4c2bd933e16e84dc22483b2a657442d45249dfceb846704dac17ee60b1"

RPROVIDES:${PN} += "ghc-dec-devel \
ghc-devel-dec-0.0.6-9n55jO9wFkCDcYlO4DYA9w"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dec \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw"

inherit rpm
