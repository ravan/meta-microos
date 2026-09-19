SUMMARY = "Haskell call-stack profiling library"
DESCRIPTION = "This package provides the Haskell call-stack profiling library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-prof-0.4.0-2.35.aarch64.rpm"
RPM_HASH = "3dbbda0fd023d90789cd9be6f2dc0a0ca5a3571fed15431226686780f51ab8a5b77d57a7415985c60e0f23d01ccf796097187377f63a7a64844ec25259d67e63"

RPROVIDES:${PN} += "ghc-call-stack-prof \
ghc-prof-call-stack-0.4.0-5oZIckzxOZr1eMyD6xWtI3"

RDEPENDS:${PN} += "ghc-call-stack-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
