SUMMARY = "Haskell network profiling library"
DESCRIPTION = "This package provides the Haskell network profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.8.0"

RPM_NAME = "ghc-network-prof-3.2.8.0-1.9.aarch64.rpm"
RPM_HASH = "f46f984fdddb0ffea95c5aec2365fecdeefd3a3c78d2da9a85617bad774aff472390ff1da486dfc2d7cd1d9f6361b50bbf948e67defeca37019005a1aabe3e8b"

RPROVIDES:${PN} += "ghc-network-prof \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI"

RDEPENDS:${PN} += "ghc-network-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-stm-2.5.3.1-6d74"

inherit rpm
