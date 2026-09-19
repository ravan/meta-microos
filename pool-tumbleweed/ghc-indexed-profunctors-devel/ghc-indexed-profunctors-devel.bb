SUMMARY = "Haskell indexed-profunctors library development files"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-devel-0.1.1.1-1.18.aarch64.rpm"
RPM_HASH = "87bceecc5567984e0458e9522bbb5ec3d1a80dab0a6648cd9d22a53b171c85a81f9bf7a51b1958a02fc243a371d7ba714eda5270a4e1c2489bdf511e3b1789ce"

RPROVIDES:${PN} += "ghc-devel-indexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO \
ghc-indexed-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-indexed-profunctors"

inherit rpm
