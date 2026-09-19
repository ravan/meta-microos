SUMMARY = "Haskell generics-sop profiling library"
DESCRIPTION = "This package provides the Haskell generics-sop profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.4"

RPM_NAME = "ghc-generics-sop-prof-0.5.1.4-2.3.aarch64.rpm"
RPM_HASH = "713e65c3bc0f16a96fd6177e447e30d5960a3e8ae4b46ce2428fca45524672232e84bbbf6835250e5c4ab0ed768e3277c98b82cae02b415f8b92bf567436ee35"

RPROVIDES:${PN} += "ghc-generics-sop-prof \
ghc-prof-generics-sop-0.5.1.4-AvLlDZ30DmSAgpFaUKsIGG"

RDEPENDS:${PN} += "ghc-generics-sop-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7"

inherit rpm
