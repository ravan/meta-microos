SUMMARY = "Haskell doctemplates profiling library"
DESCRIPTION = "This package provides the Haskell doctemplates profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.1"

RPM_NAME = "ghc-doctemplates-prof-0.11.0.1-1.27.aarch64.rpm"
RPM_HASH = "47c2f6c19395413ed2f620f26563547c7f11867b8dfd532221a89efbdb15586a531d36327cab68f084423278a7e8a27b1085f2d5d1044f2991d834101377ce5d"

RPROVIDES:${PN} += "ghc-doctemplates-prof \
ghc-prof-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J"

RDEPENDS:${PN} += "ghc-doctemplates-devel \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
