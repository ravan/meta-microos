SUMMARY = "Haskell text-ansi profiling library"
DESCRIPTION = "This package provides the Haskell text-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.1"

RPM_NAME = "ghc-text-ansi-prof-0.3.0.1-4.2.aarch64.rpm"
RPM_HASH = "7fcb768ea1877549c42a58aa16dceae2e24a3108032260e2dd11661da29fb49e9986d3781cc4d777b963f19112c3e5ee35747a1f5ec644e32c646d7f76402617"

RPROVIDES:${PN} += "ghc-prof-text-ansi-0.3.0.1-VLtME1OTfL3OjlqJPcyHR \
ghc-text-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-text-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh \
ghc-text-ansi-devel"

inherit rpm
