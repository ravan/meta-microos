SUMMARY = "Haskell unbounded-delays library development files"
DESCRIPTION = "This package provides the Haskell unbounded-delays library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-unbounded-delays-devel-0.1.1.1-1.34.aarch64.rpm"
RPM_HASH = "bf12d3e7b89ed16162daf7558b2091d33c258d996a08a3557423cbd63325898aa5bf18b0e04c4283a71efa2191eb9fabbcb152326b802c52c68987d6a0a0797c"

RPROVIDES:${PN} += "ghc-devel-unbounded-delays-0.1.1.1-GOtUGVFNnY3FmbBooyj2xV \
ghc-unbounded-delays-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-unbounded-delays"

inherit rpm
