SUMMARY = "Haskell filepath-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell filepath-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.2.0.5"

RPM_NAME = "ghc-filepath-bytestring-prof-1.5.2.0.5-1.3.aarch64.rpm"
RPM_HASH = "cf722c2e03e12448d4dbd385222c266894709e7df9224b5e0a024f9128a5920677a4e881df8373c3239b5811bdad6bcd4e01fcc4290536d5c06ed12338e5d38a"

RPROVIDES:${PN} += "ghc-filepath-bytestring-prof \
ghc-prof-filepath-bytestring-1.5.2.0.5-91PzjYWe6JYJhPT4RGVSOc"

RDEPENDS:${PN} += "ghc-filepath-bytestring-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-unix-2.8.8.0-178a"

inherit rpm
