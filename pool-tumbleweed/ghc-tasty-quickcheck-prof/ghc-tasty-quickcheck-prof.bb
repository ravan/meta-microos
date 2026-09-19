SUMMARY = "Haskell tasty-quickcheck profiling library"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck profiling library."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "ghc-tasty-quickcheck-prof-0.11.1-5.3.aarch64.rpm"
RPM_HASH = "9439704db10f56cc2e4fbd776d55456641821a622fcb96ca8da1eb34ef68ea9ff052fc6bc86970f687cc15c596f7644eb2adbfe9ea0b6d6324718f4f4fd20ce7"

RPROVIDES:${PN} += "ghc-prof-tasty-quickcheck-0.11.1-1xtFKrSdVsH6cXLURYqoyy \
ghc-tasty-quickcheck-prof"

RDEPENDS:${PN} += "ghc-prof-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-quickcheck-devel"

inherit rpm
