SUMMARY = "Haskell edit-distance library development files"
DESCRIPTION = "This package provides the Haskell edit-distance library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-devel-0.2.2.1-13.42.aarch64.rpm"
RPM_HASH = "e7f53f32cc7b6b25bfa3d249933e54034085618c339006088edf82cdd9d3e2ab2157ec65715fe52ab61b5f6ed8a7af7d6c7ca6240249c7ccd23f8c9c91354ef6"

RPROVIDES:${PN} += "ghc-devel-edit-distance-0.2.2.1-JLsBE1yu1uvGNk4hnNxFMI \
ghc-edit-distance-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-edit-distance"

inherit rpm
