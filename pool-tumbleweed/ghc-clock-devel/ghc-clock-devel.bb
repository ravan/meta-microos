SUMMARY = "Haskell clock library development files"
DESCRIPTION = "This package provides the Haskell clock library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-devel-0.8.4-1.19.aarch64.rpm"
RPM_HASH = "07b9b0cd410c1d6b1216a2ff74b87df205386a09acdb88300cba4d1b616e3f34afd202494b254aab4db875dd5c2bfabf66ad274097617cf64cd40e4c07eff9fe"

RPROVIDES:${PN} += "ghc-clock-devel \
ghc-devel-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clock \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844"

inherit rpm
