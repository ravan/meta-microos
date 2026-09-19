SUMMARY = "Haskell void profiling library"
DESCRIPTION = "This package provides the Haskell void profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-void-prof-0.7.4-1.7.aarch64.rpm"
RPM_HASH = "e8691a6c30be575e0aac7cbea29236de4ade3dc665c72a0f9ffd1b8a9f797a953407f6489f9f1b56dd3277acdcd6d0470dffab349ad34238e1fdcdbd50fdb3bb"

RPROVIDES:${PN} += "ghc-prof-void-0.7.4-18r3xgdXbMHk4AqCF5SgT \
ghc-void-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-void-devel"

inherit rpm
