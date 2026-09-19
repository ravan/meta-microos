SUMMARY = "Haskell data-clist profiling library"
DESCRIPTION = "This package provides the Haskell data-clist profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-prof-0.2-3.17.aarch64.rpm"
RPM_HASH = "9c9fc02f8fc0ba7c0ffeba2f0b07ddc59d83fd37c3c2d34d7a9f81fc834199423e148f6619c5373ce9417a1ee391574a77231a7a4ea20d6cf6ab6ffea46b8ae5"

RPROVIDES:${PN} += "ghc-data-clist-prof \
ghc-prof-data-clist-0.2-JcMjkvVz4h0BOKvHWv3aRs"

RDEPENDS:${PN} += "ghc-data-clist-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
