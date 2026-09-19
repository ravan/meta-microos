SUMMARY = "Haskell case-insensitive library development files"
DESCRIPTION = "This package provides the Haskell case-insensitive library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-devel-1.2.1.0-6.29.aarch64.rpm"
RPM_HASH = "9d4e149df33546bba9b61e7fe05c7f7f1c6aa64ef6eb5a542c76d719a2ff49e07293dd566024fdccb2895868f27ebe118468a0801786404ba6a1134699a4e5bd"

RPROVIDES:${PN} += "ghc-case-insensitive-devel \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-case-insensitive \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-devel-text-2.1.4-cf23"

inherit rpm
