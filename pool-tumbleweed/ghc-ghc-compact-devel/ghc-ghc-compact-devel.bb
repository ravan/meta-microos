SUMMARY = "Haskell ghc-compact library development files"
DESCRIPTION = "This package provides the Haskell ghc-compact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-devel-0.1.0.0-1.3.aarch64.rpm"
RPM_HASH = "0e20da710006d3f1a681a3a8fb9dc289938c1ec7e4b53d28d49ce830c310eeec25269efcb21a51228765a122349da484421a172ded2253d61f1e1a393cc85830"

RPROVIDES:${PN} += "ghc-devel-ghc-compact-0.1.0.0-bdec \
ghc-ghc-compact-devel \
ghc-ghc-compact-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-ghc-compact"

inherit rpm
