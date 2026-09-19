SUMMARY = "Haskell case-insensitive profiling library"
DESCRIPTION = "This package provides the Haskell case-insensitive profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-prof-1.2.1.0-6.29.aarch64.rpm"
RPM_HASH = "61c4bd019a7e9df93d9247b10c5512ce60c14a2e5595b099674956ee8ee31f6ef7c340fcfb447d7b8c9ce512023bde265833f723b4adc477fec6963af4f9c714"

RPROVIDES:${PN} += "ghc-case-insensitive-prof \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC"

RDEPENDS:${PN} += "ghc-case-insensitive-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-text-2.1.4-cf23"

inherit rpm
