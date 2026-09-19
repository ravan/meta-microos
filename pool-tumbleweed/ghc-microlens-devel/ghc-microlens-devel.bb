SUMMARY = "Haskell microlens library development files"
DESCRIPTION = "This package provides the Haskell microlens library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.0"

RPM_NAME = "ghc-microlens-devel-0.5.0.0-1.9.aarch64.rpm"
RPM_HASH = "c13cc5ef72ac29e6afb266bda9599faad8763f3595ac012358f2c9e57e6961febcc46e13e0611b510dcc40fe0ec91ecca88a95d8a02e6ad9136f26c66c04a352"

RPROVIDES:${PN} += "ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-microlens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-microlens"

inherit rpm
