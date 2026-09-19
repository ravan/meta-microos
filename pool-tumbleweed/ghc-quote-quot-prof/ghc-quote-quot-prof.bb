SUMMARY = "Haskell quote-quot profiling library"
DESCRIPTION = "This package provides the Haskell quote-quot profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-quote-quot-prof-0.2.1.0-1.21.aarch64.rpm"
RPM_HASH = "a70885f74f36baf3410120bb5826e867aead4c7c0b1e4bd3ed95f97b973f26a38d579fc0bc4931336f5a68373cf2a79f0560ba2519e6d2b6eabc984dfa4dbbc5"

RPROVIDES:${PN} += "ghc-prof-quote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK \
ghc-quote-quot-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-quote-quot-devel"

inherit rpm
