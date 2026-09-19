SUMMARY = "Haskell generics-sop library development files"
DESCRIPTION = "This package provides the Haskell generics-sop library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.4"

RPM_NAME = "ghc-generics-sop-devel-0.5.1.4-2.3.aarch64.rpm"
RPM_HASH = "727fec5a34d4077ad5e8a22b9bbe061028c2895fb00584af6fd94abc088e4628f2502eb1df462f1c0ed9ae1ff251a21620dc2e19911e36b72bcdd6ad5b36c066"

RPROVIDES:${PN} += "ghc-devel-generics-sop-0.5.1.4-AvLlDZ30DmSAgpFaUKsIGG \
ghc-generics-sop-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-sop-core-0.5.0.2-JbzyU3U5Jc9a9b8Omhy6m \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-generics-sop"

inherit rpm
