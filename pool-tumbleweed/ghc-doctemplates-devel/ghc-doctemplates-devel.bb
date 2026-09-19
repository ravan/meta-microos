SUMMARY = "Haskell doctemplates library development files"
DESCRIPTION = "This package provides the Haskell doctemplates library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.0.1"

RPM_NAME = "ghc-doctemplates-devel-0.11.0.1-1.27.aarch64.rpm"
RPM_HASH = "f74d8c8126c9175cc48bb1b7f114e8a9558a002ff2240b645cf8fdf5da050d591a0ce953cac4bf1c99f86786b84ec5d329831fab85cd687f26debdf9c4a3de13"

RPROVIDES:${PN} += "ghc-devel-doctemplates-0.11.0.1-IzKaCnMe41UBaZntO1p87J \
ghc-doctemplates-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-doclayout-0.5.0.3-6oU5Og9jiD67xwlm4qJ1ii \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-safe-0.3.21-AzRUUYeJ47sQc55olWnva \
ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-doctemplates"

inherit rpm
