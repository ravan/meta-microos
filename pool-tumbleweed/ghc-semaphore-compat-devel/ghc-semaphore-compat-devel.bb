SUMMARY = "Haskell semaphore-compat library development files"
DESCRIPTION = "This package provides the Haskell semaphore-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "ghc-semaphore-compat-devel-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "76be229e7c146d5ccadc5fb158bddc1b3cabf2a0f83839a834fbcddd67d8552b0b6e37aa5bd23f15f825901db9684156dce5cfc24dfc5b67bda5ee06088dd23a"

RPROVIDES:${PN} += "ghc-devel-semaphore-compat-1.0.0-cc95 \
ghc-semaphore-compat-devel \
ghc-semaphore-compat-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-unix-2.8.8.0-178a \
ghc-semaphore-compat"

inherit rpm
