SUMMARY = "Haskell digest profiling library"
DESCRIPTION = "This package provides the Haskell digest profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.2.1"

RPM_NAME = "ghc-digest-prof-0.0.2.1-1.25.aarch64.rpm"
RPM_HASH = "3d2ff32e47f589deceda0f01866cd34bb478417938f5ebe956fead0628aeac5b76edf799bbf8d6bd52444ef5cc67c00fb31ba86431a9295a2e55dbbe1d000b48"

RPROVIDES:${PN} += "ghc-digest-prof \
ghc-prof-digest-0.0.2.1-KdJahDzYM113RUTsWm7UXN"

RDEPENDS:${PN} += "ghc-digest-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
