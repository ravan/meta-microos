SUMMARY = "Haskell xml profiling library"
DESCRIPTION = "This package provides the Haskell xml profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-prof-1.3.14-13.32.aarch64.rpm"
RPM_HASH = "84ec8b045002be020732cdb12a9b704db62ab19c71ff6904356b9e7cc197cc04cf2e7f017599220cde8f27177e948da6a885e5e61d78d303e57f8368ec694912"

RPROVIDES:${PN} += "ghc-prof-xml-1.3.14-JuCOsTtMISWPxn2nU4HVl \
ghc-xml-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23 \
ghc-xml-devel"

inherit rpm
