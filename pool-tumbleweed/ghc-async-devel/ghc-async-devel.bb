SUMMARY = "Haskell async library development files"
DESCRIPTION = "This package provides the Haskell async library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "ghc-async-devel-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "72044e83c9669fd903f18fda45a989bd5c257b0b47ee21e17c9d294880768e53f1073c5ce874bf8d9978b3775ef7b1fef27092f5d221bba3180f302008b2df3e"

RPROVIDES:${PN} += "ghc-async-devel \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-async \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
