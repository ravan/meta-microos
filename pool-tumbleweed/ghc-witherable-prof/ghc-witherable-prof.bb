SUMMARY = "Haskell witherable profiling library"
DESCRIPTION = "This package provides the Haskell witherable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-witherable-prof-0.5-2.3.aarch64.rpm"
RPM_HASH = "c2174e43958240732b9baba3d38d8ad63c0af6a7c57468f0e73a667dfd6723560bbe52bc0f31db7997adfa72a2c17dc837b7ef9fcd8a8692232336ed519126a0"

RPROVIDES:${PN} += "ghc-prof-witherable-0.5-9N1HkgvlVrcAVLkWTGxi2z \
ghc-witherable-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-witherable-devel"

inherit rpm
