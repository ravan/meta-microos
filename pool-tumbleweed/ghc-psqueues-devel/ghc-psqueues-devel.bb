SUMMARY = "Haskell psqueues library development files"
DESCRIPTION = "This package provides the Haskell psqueues library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.8.3"

RPM_NAME = "ghc-psqueues-devel-0.2.8.3-2.3.aarch64.rpm"
RPM_HASH = "3fb66723cfde56fc2038a3409c59d888b969cda89e6db47255b1978e2214e08c87d0f169a04953292ae53eca1b44e60fec4e4a3d1b5fe851bc7a19005e2426f3"

RPROVIDES:${PN} += "ghc-devel-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-psqueues-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-psqueues"

inherit rpm
