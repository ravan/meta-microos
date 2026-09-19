SUMMARY = "Haskell text-iso8601 profiling library"
DESCRIPTION = "This package provides the Haskell text-iso8601 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-text-iso8601-prof-0.1.1.1-1.3.aarch64.rpm"
RPM_HASH = "673ca57a63c2bd3d352b56cef01680c62958d9611075cf90c1458cfd56ff5f9e9df31a775b7109948c0cc289231cd21d3e403afb448c03c24ee9061e6e21003d"

RPROVIDES:${PN} += "ghc-prof-text-iso8601-0.1.1.1-6Bjz9eUSPP1K02pEWpeews \
ghc-text-iso8601-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-time-1.14-a7dc \
ghc-prof-time-compat-1.9.9-2vndaypoxzm5lJpcdxrQvS \
ghc-text-iso8601-devel"

inherit rpm
