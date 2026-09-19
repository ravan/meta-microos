SUMMARY = "Haskell xml-hamlet profiling library"
DESCRIPTION = "This package provides the Haskell xml-hamlet profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.3"

RPM_NAME = "ghc-xml-hamlet-prof-0.5.0.3-1.10.aarch64.rpm"
RPM_HASH = "625923296108b88f0c5a5fe97ea1b4a28ac2f57b8d0aa75aa459e140ae9d112cfd8a921a5c7543c7e12fb4131a0eb61f12d15aea7415828780d8ec220e383099"

RPROVIDES:${PN} += "ghc-prof-xml-hamlet-0.5.0.3-G8bMr9HQdFfCaa7mBpjnmK \
ghc-xml-hamlet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-shakespeare-2.1.7.1-gK4gmGoNfcEYOAsglU3w4 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-xml-conduit-1.10.1.0-Jdtas0kp0k3Ah1vCZSqZl4 \
ghc-xml-hamlet-devel"

inherit rpm
