SUMMARY = "Haskell setenv profiling library"
DESCRIPTION = "This package provides the Haskell setenv profiling library."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-prof-0.1.1.3-12.23.aarch64.rpm"
RPM_HASH = "37af07e29e171ae40b12b1c259226938a7af1a5bfa0efad717df8d2fdd3eb11f3dfef898fba795ce5074b9dda9c34e126d4281908e6f87dfc7d5e94d107dd01c"

RPROVIDES:${PN} += "ghc-prof-setenv-0.1.1.3-DGkCIo7XRqzD68Dz6COumh \
ghc-setenv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-unix-2.8.8.0-178a \
ghc-setenv-devel"

inherit rpm
