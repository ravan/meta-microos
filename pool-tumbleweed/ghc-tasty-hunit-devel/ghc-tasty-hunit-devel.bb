SUMMARY = "Haskell tasty-hunit library development files"
DESCRIPTION = "This package provides the Haskell tasty-hunit library development files."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-hunit-devel-0.10.2-1.18.aarch64.rpm"
RPM_HASH = "a44c914f6672a4d7564acb37d63008e0ded79d8b9d7a8acd6e1f4b81ff1a1d49df4e6eec4c0e0bfe92af9581436a9c3cdfe38f4a57bd6184d444659c49ea74aa"

RPROVIDES:${PN} += "ghc-devel-tasty-hunit-0.10.2-7q5ZQxy9Ub5ZvPfhG0K4P \
ghc-tasty-hunit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3 \
ghc-devel-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-tasty-hunit"

inherit rpm
