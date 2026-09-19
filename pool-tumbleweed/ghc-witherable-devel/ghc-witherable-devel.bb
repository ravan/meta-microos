SUMMARY = "Haskell witherable library development files"
DESCRIPTION = "This package provides the Haskell witherable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-witherable-devel-0.5-2.3.aarch64.rpm"
RPM_HASH = "3bb997c3ed34cdef32b61657a09f2067ede200f0911ccc5dce7ff3220d24f96538b48eb364b8b319810e65884c48928cf0ef02b6249da5f5f87defc955fb42d8"

RPROVIDES:${PN} += "ghc-devel-witherable-0.5-9N1HkgvlVrcAVLkWTGxi2z \
ghc-witherable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-witherable"

inherit rpm
