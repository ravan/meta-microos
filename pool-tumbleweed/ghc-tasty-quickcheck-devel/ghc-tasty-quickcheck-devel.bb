SUMMARY = "Haskell tasty-quickcheck library development files"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library development \
files."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "ghc-tasty-quickcheck-devel-0.11.1-5.3.aarch64.rpm"
RPM_HASH = "51b6fc321a24b0a5aa257bb8af496e8a1764b2e48403d98cb04249093bc92dd44cac7d654a1135b6dfc1a77be5532f2da1b4ce635fb1012ddde8f52e030e04fd"

RPROVIDES:${PN} += "ghc-devel-tasty-quickcheck-0.11.1-1xtFKrSdVsH6cXLURYqoyy \
ghc-tasty-quickcheck-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.15.0.1-BiJUyvfspYF6JuhHRqpj7J \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-optparse-applicative-0.19.0.0-GyrRSLDSSh1GQCxnTYbnDq \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-quickcheck"

inherit rpm
