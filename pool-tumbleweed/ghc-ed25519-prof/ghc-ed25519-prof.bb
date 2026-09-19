SUMMARY = "Haskell ed25519 profiling library"
DESCRIPTION = "This package provides the Haskell ed25519 profiling library."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-prof-0.0.5.0-18.14.aarch64.rpm"
RPM_HASH = "0bd1f673b14a4ef1bf25d931f6c5970938a5460bb2da830bb313e7fb2c4df75ffe4b9c0f82fe9e23494a06ce39b82500c909519cb17bba4dcdc121d48b8a9142"

RPROVIDES:${PN} += "ghc-ed25519-prof \
ghc-prof-ed25519-0.0.5.0-LJoM5RH0WDTKH6EJLYztMY"

RDEPENDS:${PN} += "ghc-ed25519-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-ghc-prim-0.13.0-f55c"

inherit rpm
