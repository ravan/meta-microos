SUMMARY = "Haskell math-functions profiling library"
DESCRIPTION = "This package provides the Haskell math-functions profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.4"

RPM_NAME = "ghc-math-functions-prof-0.3.4.4-1.35.aarch64.rpm"
RPM_HASH = "a9b02f440874d65ff0e8c332a0e0cb402bde283d8f0cb0c60f23bb30bd638fd8d88754e924fed8c7a348b280f22d8102c992eb2e00509e19b9dd51522debf860"

RPROVIDES:${PN} += "ghc-math-functions-prof \
ghc-prof-math-functions-0.3.4.4-q26fT9mxS1GCWlSGs7P32"

RDEPENDS:${PN} += "ghc-math-functions-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
