SUMMARY = "Haskell tasty-hunit profiling library"
DESCRIPTION = "This package provides the Haskell tasty-hunit profiling library."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-hunit-prof-0.10.2-1.18.aarch64.rpm"
RPM_HASH = "39fce59542c96b2e19e310a7a39425d93ccce7120be09d82f327852ca9ece84b246b473e3c718d00ffb1b22df2e0238c022290567879821719df0aa2f5b0b690"

RPROVIDES:${PN} += "ghc-prof-tasty-hunit-0.10.2-7q5ZQxy9Ub5ZvPfhG0K4P \
ghc-tasty-hunit-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-hunit-devel"

inherit rpm
