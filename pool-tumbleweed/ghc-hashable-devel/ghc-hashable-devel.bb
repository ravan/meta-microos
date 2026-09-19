SUMMARY = "Haskell hashable library development files"
DESCRIPTION = "This package provides the Haskell hashable library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-hashable-devel-1.5.1.0-1.3.aarch64.rpm"
RPM_HASH = "d04d01d2838e450e51f57e9f26ad9d593634273a3ee81cd9b32d92adf791d6bc68bd0f3a815c35281386e561ebbf642318bd48fcdf6367a02b9ac8634548afd1"

RPROVIDES:${PN} += "ghc-devel-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-hashable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-os-string-2.0.10-5320 \
ghc-devel-text-2.1.4-cf23 \
ghc-hashable"

inherit rpm
