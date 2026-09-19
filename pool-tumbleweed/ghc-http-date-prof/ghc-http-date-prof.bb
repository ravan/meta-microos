SUMMARY = "Haskell http-date profiling library"
DESCRIPTION = "This package provides the Haskell http-date profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-prof-0.0.11-2.40.aarch64.rpm"
RPM_HASH = "d8fcb4218d7b0546d8737616fe59e41cafe17d724976aff9afbfb6d0901e98d13a8f8808273af9419160dcf802d49df2828583777cb3166a06fe577e0f3a3e2d"

RPROVIDES:${PN} += "ghc-http-date-prof \
ghc-prof-http-date-0.0.11-6QGoEWt5iWVBVu6inZxd9J"

RDEPENDS:${PN} += "ghc-http-date-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-time-1.14-a7dc"

inherit rpm
