SUMMARY = "Haskell microlens profiling library"
DESCRIPTION = "This package provides the Haskell microlens profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.0"

RPM_NAME = "ghc-microlens-prof-0.5.0.0-1.9.aarch64.rpm"
RPM_HASH = "a5f426d189d046d5bce8ea236be1dac1a49aaca9be47e0abe470854e7a5c632b3244c4e4600daf3cd75219b3fa0ef9e2d8e1cd2bcbc50da26e0258f149b21e82"

RPROVIDES:${PN} += "ghc-microlens-prof \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3"

RDEPENDS:${PN} += "ghc-microlens-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
