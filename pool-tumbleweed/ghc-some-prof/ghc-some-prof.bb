SUMMARY = "Haskell some profiling library"
DESCRIPTION = "This package provides the Haskell some profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "ghc-some-prof-1.0.6-6.3.aarch64.rpm"
RPM_HASH = "e96ed2b99c839e618b708de6851a08410ce55d2d1c885e7f3d7e1870df058d0f30adbdf469dcc54206cdafcd2a53adc6f0ff5f92afa70f0f437f824c6b3c6681"

RPROVIDES:${PN} += "ghc-prof-some-1.0.6-8u6QsVxyLEPKKVYkZL0j6j \
ghc-some-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-some-devel"

inherit rpm
