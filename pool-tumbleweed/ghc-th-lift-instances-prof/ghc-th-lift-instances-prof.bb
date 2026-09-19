SUMMARY = "Haskell th-lift-instances profiling library"
DESCRIPTION = "This package provides the Haskell th-lift-instances profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-prof-0.1.20-2.36.aarch64.rpm"
RPM_HASH = "a77aa760e04e390f08db0b497d26635b2129956ce84eb7d1a0a18dc1f10f53de7c9b54d74a085b12619819aa3d0bcbe89d0e84cdeec15db03530e151c186f6f0"

RPROVIDES:${PN} += "ghc-prof-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-th-lift-instances-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-th-lift-0.8.7-C08bSURuEXt2IuYgZMzZEc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-th-lift-instances-devel"

inherit rpm
