SUMMARY = "Haskell unbounded-delays profiling library"
DESCRIPTION = "This package provides the Haskell unbounded-delays profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-unbounded-delays-prof-0.1.1.1-1.34.aarch64.rpm"
RPM_HASH = "e4e36aca35628df5e2c5045697f3fcb56b633c2a6c6ecdc7d632ba172779482c9ab6f91d9283e95a36d13d31c50a951af5a228e8dc2578e97d08b12d4d32dabe"

RPROVIDES:${PN} += "ghc-prof-unbounded-delays-0.1.1.1-GOtUGVFNnY3FmbBooyj2xV \
ghc-unbounded-delays-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-unbounded-delays-devel"

inherit rpm
