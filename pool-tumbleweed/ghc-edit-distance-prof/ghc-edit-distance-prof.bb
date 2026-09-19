SUMMARY = "Haskell edit-distance profiling library"
DESCRIPTION = "This package provides the Haskell edit-distance profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-prof-0.2.2.1-13.42.aarch64.rpm"
RPM_HASH = "93522ad09c310981a50a6e31e3e46b8d765843d937f6a7f9e68e629938a7af247fbd1b9b9d92afe96b00a043e8018e70dda0f7bcf2ec4660e8bfe879419f53ea"

RPROVIDES:${PN} += "ghc-edit-distance-prof \
ghc-prof-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI"

RDEPENDS:${PN} += "ghc-edit-distance-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh"

inherit rpm
