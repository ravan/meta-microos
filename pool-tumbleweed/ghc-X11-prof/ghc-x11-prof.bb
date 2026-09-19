SUMMARY = "Haskell X11 profiling library"
DESCRIPTION = "This package provides the Haskell X11 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-prof-1.10.3-5.11.aarch64.rpm"
RPM_HASH = "b3db65d6bdfa275cd317b3cd06c9555e26e0fba6e1bd33a2f564a6c9bc34dedb78b0d42e1c48016cf759b5ccf14571aa6d9fd45c18c497eca61eec47bb27d926"

RPROVIDES:${PN} += "ghc-X11-prof \
ghc-prof-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk"

RDEPENDS:${PN} += "ghc-X11-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62"

inherit rpm
