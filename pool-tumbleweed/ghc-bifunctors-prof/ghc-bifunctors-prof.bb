SUMMARY = "Haskell bifunctors profiling library"
DESCRIPTION = "This package provides the Haskell bifunctors profiling library."
LICENSE = "BSD-2-Clause"

PV = "5.6.3"

RPM_NAME = "ghc-bifunctors-prof-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "f1a102922b53c344b54a620f123eee8aab1ec1f05144c7c82412ed31b4d3b4051037e27b225c279e201ec58cb4ae1fef3f41d9020db01862a1da9b1d4465cf11"

RPROVIDES:${PN} += "ghc-bifunctors-prof \
ghc-prof-bifunctors-5.6.3-9Dfko6C8LIIe8HG4zoeag"

RDEPENDS:${PN} += "ghc-bifunctors-devel \
ghc-prof-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-comonad-5.0.10-Adp50yscRn74SK6wUdL7QP \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7"

inherit rpm
