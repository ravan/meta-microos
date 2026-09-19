SUMMARY = "Haskell scientific library development files"
DESCRIPTION = "This package provides the Haskell scientific library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.8.1"

RPM_NAME = "ghc-scientific-devel-0.3.8.1-1.3.aarch64.rpm"
RPM_HASH = "ef46bb6cf749b388d3728734e7246380c7186e108c91ae4c0d470606900fbbacf5ba307371ab593b5db9583a68cb0447eb9484eaa8c6ab7969d14690c1014b6e"

RPROVIDES:${PN} += "ghc-devel-scientific-0.3.8.1-EfN6leGWc5k1t5YPK2dkVk \
ghc-scientific-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-integer-logarithms-1.0.5-7oN15VqsexT8F3DIJBcPo2 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-scientific"

inherit rpm
