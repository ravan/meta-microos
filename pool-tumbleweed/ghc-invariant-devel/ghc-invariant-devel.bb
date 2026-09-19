SUMMARY = "Haskell invariant library development files"
DESCRIPTION = "This package provides the Haskell invariant library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-invariant-devel-0.6.5-1.3.aarch64.rpm"
RPM_HASH = "916e802cafb39606b67978c12c35c0f9ec93625cc7a38ebc496dabcdcdcf3e21f1ac45bf2cf58fa2b8ca3613243e5a6a883324ff98cf15454b72a154242ce35c"

RPROVIDES:${PN} += "ghc-devel-invariant-0.6.5-DrqO3CbAMrLCl36mqBRofr \
ghc-invariant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag \
ghc-devel-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4 \
ghc-devel-profunctors-5.6.3-CPqBm5VgzT9DSAiXWxFcrG \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-invariant"

inherit rpm
