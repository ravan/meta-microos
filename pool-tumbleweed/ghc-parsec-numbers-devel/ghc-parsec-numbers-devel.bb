SUMMARY = "Haskell parsec-numbers library development files"
DESCRIPTION = "This package provides the Haskell parsec-numbers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-devel-0.1.0-7.19.aarch64.rpm"
RPM_HASH = "893f152ccaaf6b3e0b6c56dc125ffb092030fe20f27773edd3bb6e05c251ccbb5301b3a5ef33226795fff3f71c8d1b5ba9529a98bd91abb8bb2b32a8f6c6177d"

RPROVIDES:${PN} += "ghc-devel-parsec-numbers-0.1.0-AMPF59BsE5W4SuUj5AhufY \
ghc-parsec-numbers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-parsec-numbers"

inherit rpm
