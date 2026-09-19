SUMMARY = "Haskell indexed-traversable-instances profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-instances-prof-0.1.2.1-1.3.aarch64.rpm"
RPM_HASH = "ca2d80653444c2ff0b571a41c966e1b0f52ee2087979c48b87eaf41e3002796685bc0c91117a23c59bf8440f1a5d564ccd1dfe5b9c10e47de6348524b5eff063"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-prof \
ghc-prof-indexed-traversable-instances-0.1.2.1-6YpZT8gBjiD9ssAaPGVbKH"

RDEPENDS:${PN} += "ghc-indexed-traversable-instances-devel \
ghc-prof-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
