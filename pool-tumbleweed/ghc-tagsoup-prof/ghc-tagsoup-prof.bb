SUMMARY = "Haskell tagsoup profiling library"
DESCRIPTION = "This package provides the Haskell tagsoup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-prof-0.14.8-6.31.aarch64.rpm"
RPM_HASH = "48aaf3a133c7254b5210aec2d4f3dd456d7e713cb338eca5d7c85a97dc18f15a4a2d01da28fb8c0e89586ffeb013fc0aa2b12a33e6c38b2e1374c87f5d6eda70"

RPROVIDES:${PN} += "ghc-prof-tagsoup-0.14.8-10TuRISnkEwKwhRg5mGRCv \
ghc-tagsoup-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23 \
ghc-tagsoup-devel"

inherit rpm
