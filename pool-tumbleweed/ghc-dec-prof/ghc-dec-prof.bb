SUMMARY = "Haskell dec profiling library"
DESCRIPTION = "This package provides the Haskell dec profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.6"

RPM_NAME = "ghc-dec-prof-0.0.6-3.2.aarch64.rpm"
RPM_HASH = "296fb68bdae1f95da09ac8cf229d9fbb417163960f937805dc7aaf347d410e1579cc331330d837fa02a6daadbf5569514a866d5412551a57061bfa9cfffc7e5b"

RPROVIDES:${PN} += "ghc-dec-prof \
ghc-prof-dec-0.0.6-9n55jO9wFkCDcYlO4DYA9w"

RDEPENDS:${PN} += "ghc-dec-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-boring-0.2.2.1-8s8A4hTb7xgDndEEz6qoTw"

inherit rpm
