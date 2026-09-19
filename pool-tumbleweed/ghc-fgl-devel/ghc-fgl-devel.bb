SUMMARY = "Haskell fgl library development files"
DESCRIPTION = "This package provides the Haskell fgl library development files."
LICENSE = "BSD-3-Clause"

PV = "5.8.3.1"

RPM_NAME = "ghc-fgl-devel-5.8.3.1-1.3.aarch64.rpm"
RPM_HASH = "70dadbc660691afb72afd551e2c8e924fec710e90ca1cb32b1fc8fec3dcc29a8f83fded067a787822fd3811b0bbf67d8e4529520a5693d1ea0d5558cab76f583"

RPROVIDES:${PN} += "ghc-devel-fgl-5.8.3.1-7WeyqbkdcX2Klu3tCAsWkr \
ghc-fgl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-fgl"

inherit rpm
