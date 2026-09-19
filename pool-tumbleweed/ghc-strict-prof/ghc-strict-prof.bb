SUMMARY = "Haskell strict profiling library"
DESCRIPTION = "This package provides the Haskell strict profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "ghc-strict-prof-0.5.1-2.16.aarch64.rpm"
RPM_HASH = "ea6bab802384d93dcee518cb1f812344e2939cc62d221069e47638a86faa4b61a320615ca753226482bb0970374da81a19de7dbb4ac6f3df9931a01ea12ed9a9"

RPROVIDES:${PN} += "ghc-prof-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-strict-prof"

RDEPENDS:${PN} += "ghc-prof-assoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-strict-devel"

inherit rpm
