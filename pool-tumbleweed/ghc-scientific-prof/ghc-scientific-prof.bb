SUMMARY = "Haskell scientific profiling library"
DESCRIPTION = "This package provides the Haskell scientific profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.8.1"

RPM_NAME = "ghc-scientific-prof-0.3.8.1-1.3.aarch64.rpm"
RPM_HASH = "4118bf766c945a7e5238da89c024ee63e655d542e8217d1ed83fc7aada200ec949f9abecbcfeef873c2b5635b88a1f295da6677868d3312138e0e8f6a98a28e5"

RPROVIDES:${PN} += "ghc-prof-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-scientific-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-scientific-devel"

inherit rpm
