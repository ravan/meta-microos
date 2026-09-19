SUMMARY = "Haskell microlens-th library development files"
DESCRIPTION = "This package provides the Haskell microlens-th library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.18"

RPM_NAME = "ghc-microlens-th-devel-0.4.3.18-2.3.aarch64.rpm"
RPM_HASH = "1ac667576ea521ad3b26b6105482c5ed21a4fc906b0790e9ce22d685e65f59b97c507fcf190ad791fecabf2edaff71171b26638e0564106aee4f24b3911431f1"

RPROVIDES:${PN} += "ghc-devel-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN \
ghc-microlens-th-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-microlens-th"

inherit rpm
