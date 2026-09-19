SUMMARY = "Haskell indexed-traversable profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-indexed-traversable-prof-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "1265b015f219d28be6aa4e34cd82fe8f994679a84a0f544fc93301ef176a2c487d308ca5b12b85250949a560d1b621aa2669a9e515427617101ab6c2de5c88e2"

RPROVIDES:${PN} += "ghc-indexed-traversable-prof \
ghc-prof-indexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW"

RDEPENDS:${PN} += "ghc-indexed-traversable-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
