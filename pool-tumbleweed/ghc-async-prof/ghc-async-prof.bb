SUMMARY = "Haskell async profiling library"
DESCRIPTION = "This package provides the Haskell async profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.6"

RPM_NAME = "ghc-async-prof-2.2.6-1.3.aarch64.rpm"
RPM_HASH = "eaba4204a527470216a9d5f019fa94802463cd2a4da29a4fb75decd7be4441e118bf5e6c64de06df7028ea61de14665047919fa4c0c35d2ad1c74db678518c84"

RPROVIDES:${PN} += "ghc-async-prof \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6"

RDEPENDS:${PN} += "ghc-async-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
