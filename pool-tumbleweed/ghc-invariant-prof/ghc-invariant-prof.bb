SUMMARY = "Haskell invariant profiling library"
DESCRIPTION = "This package provides the Haskell invariant profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-invariant-prof-0.6.5-1.3.aarch64.rpm"
RPM_HASH = "7ac00c82c039ab2d20a5e2f4980f47bf3f9094fc05f6d66f7594b485474fa11613f042a0a4a80d42fb5ef51acf8ac51876145434cea4569ec5d7b0cdc6bfb176"

RPROVIDES:${PN} += "ghc-invariant-prof \
ghc-prof-invariant-0.6.5-DrqO3CbAMrLCl36mqBRofr"

RDEPENDS:${PN} += "ghc-invariant-devel \
ghc-prof-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-prof-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu"

inherit rpm
