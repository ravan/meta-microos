SUMMARY = "Haskell psqueues profiling library"
DESCRIPTION = "This package provides the Haskell psqueues profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.8.3"

RPM_NAME = "ghc-psqueues-prof-0.2.8.3-2.3.aarch64.rpm"
RPM_HASH = "8a44515a3a07ff6b3918c68a72e28d2a280d7bd74a951070a675f8d2747778b7637513bbb39d82527ea72a2cbe2e735741af2118564e5da3dab6f97958cebd9b"

RPROVIDES:${PN} += "ghc-prof-psqueues-0.2.8.3-LV1BnLV5SZeHAyWb6kEDRu \
ghc-psqueues-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-psqueues-devel"

inherit rpm
