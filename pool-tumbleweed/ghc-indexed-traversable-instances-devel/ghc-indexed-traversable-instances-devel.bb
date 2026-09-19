SUMMARY = "Haskell indexed-traversable-instances library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library \
development files."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-instances-devel-0.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "c71ab181317ed8af5985ae84a992ea9ed0b3569b7828284a4536c6a1e31fd7bed7666e50c025306551e4f0ef84c471b3072458e56ab4c47c30cead7e970f0cfb"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH \
ghc-indexed-traversable-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-indexed-traversable-instances"

inherit rpm
