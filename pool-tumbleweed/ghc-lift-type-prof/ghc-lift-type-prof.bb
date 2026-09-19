SUMMARY = "Haskell lift-type profiling library"
DESCRIPTION = "This package provides the Haskell lift-type profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-lift-type-prof-0.1.2.0-1.12.aarch64.rpm"
RPM_HASH = "d0c4d6c236d803bc01fac0dd9a111aa73f3932dbd203e46133605326a79e657c592b946ce19f9fc49e6bc563f313a12bb013555ef2e00c6d5eea5706c5025b2a"

RPROVIDES:${PN} += "ghc-lift-type-prof \
ghc-prof-lift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO"

RDEPENDS:${PN} += "ghc-lift-type-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a"

inherit rpm
