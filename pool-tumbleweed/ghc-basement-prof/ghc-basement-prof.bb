SUMMARY = "Haskell basement profiling library"
DESCRIPTION = "This package provides the Haskell basement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-prof-0.0.16-1.32.aarch64.rpm"
RPM_HASH = "d5a44017b0192ce736b2c9704a1b1e303baf2d465fae9c90ecb6bef215065beff2bd52bb1758ee546ce2b2170aa176b0aae6d6b3122bd49a2ab74d7d0709dd35"

RPROVIDES:${PN} += "ghc-basement-prof \
ghc-prof-basement-0.0.16-EFfarL5MHPIHNlTrgpSdN2"

RDEPENDS:${PN} += "ghc-basement-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c"

inherit rpm
