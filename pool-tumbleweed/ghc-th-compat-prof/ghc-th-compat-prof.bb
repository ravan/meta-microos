SUMMARY = "Haskell th-compat profiling library"
DESCRIPTION = "This package provides the Haskell th-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.7"

RPM_NAME = "ghc-th-compat-prof-0.1.7-1.3.aarch64.rpm"
RPM_HASH = "06d25d014f76b67639471e4f6c5204dd19489adc1b83a743fb3cf73dccfaafc658708fa0b57a8e3491b592e1b91d7fb2a51411c0276dff85d6f5f3b250ae9ccf"

RPROVIDES:${PN} += "ghc-prof-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp \
ghc-th-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-th-compat-devel"

inherit rpm
