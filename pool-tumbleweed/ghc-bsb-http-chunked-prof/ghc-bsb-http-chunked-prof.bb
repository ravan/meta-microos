SUMMARY = "Haskell bsb-http-chunked profiling library"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-prof-0.0.0.4-7.17.aarch64.rpm"
RPM_HASH = "2abd4103890b2641ecca685cd926a856e28532ee8eb69ea692c2c22fa0e7d4ab158e46c81b9feb9111880141e397028ac5ab30d9fe01f33805a326ca9a1eddc8"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-prof \
ghc-prof-bsb-http-chunked-0.0.0.4-5cZHaHeIaQxIWhD1tKvYpE"

RDEPENDS:${PN} += "ghc-bsb-http-chunked-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
