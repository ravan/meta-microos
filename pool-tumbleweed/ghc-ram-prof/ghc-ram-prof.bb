SUMMARY = "Haskell ram profiling library"
DESCRIPTION = "This package provides the Haskell ram profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "ghc-ram-prof-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "3381ff8aa1e35827c7dba797767b097e8c98eb28a536d8975daaaaee62eb3cf7ae8a9a49c20a86e3dc851ecaae7530b6aeff03dd7856fc4589570ae0b117d994"

RPROVIDES:${PN} += "ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr \
ghc-ram-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-ram-devel"

inherit rpm
