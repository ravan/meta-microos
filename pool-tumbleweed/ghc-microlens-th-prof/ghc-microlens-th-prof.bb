SUMMARY = "Haskell microlens-th profiling library"
DESCRIPTION = "This package provides the Haskell microlens-th profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.18"

RPM_NAME = "ghc-microlens-th-prof-0.4.3.18-2.3.aarch64.rpm"
RPM_HASH = "09862e66147ce86d1b893ee3a2db63333588d1fd52ac01173d98401fd1be55015205c1be0346c5197ba39448cb185dcf0e6e8da9f225e549534b502db7dcbff8"

RPROVIDES:${PN} += "ghc-microlens-th-prof \
ghc-prof-microlens-th-0.4.3.18-5y491C8iAr58VYbwqIS2QN"

RDEPENDS:${PN} += "ghc-microlens-th-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
