SUMMARY = "Haskell skein profiling library"
DESCRIPTION = "This package provides the Haskell skein profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-prof-1.0.9.4-4.26.aarch64.rpm"
RPM_HASH = "51b92c716393092055a8ab7455736f404cca406ef3dc04a25c08e2a52cb914d9d3b32ee59461c600fe93bae2ccdb753a8ea784f963d3647dd4865e04b0571ee3"

RPROVIDES:${PN} += "ghc-prof-skein-1.0.9.4-1EnnjgQJNmMDn7VwfDrKcW \
ghc-skein-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-crypto-api-0.13.3-BvysNl9crxvRkhKzviyjB \
ghc-prof-tagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7 \
ghc-skein-devel"

inherit rpm
