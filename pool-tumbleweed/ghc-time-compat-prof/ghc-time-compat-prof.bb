SUMMARY = "Haskell time-compat profiling library"
DESCRIPTION = "This package provides the Haskell time-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.9.9"

RPM_NAME = "ghc-time-compat-prof-1.9.9-1.3.aarch64.rpm"
RPM_HASH = "5bcd988e6b2e3bdd2e128440bf6c89a6d7fccd8066b7fd226675fc0d0ded2ebc71a75d280eaa46c98de1eba88f13793655acea99fe6e1b7a8542e264a2185d9a"

RPROVIDES:${PN} += "ghc-prof-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-time-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-time-1.14-a7dc \
ghc-time-compat-devel"

inherit rpm
