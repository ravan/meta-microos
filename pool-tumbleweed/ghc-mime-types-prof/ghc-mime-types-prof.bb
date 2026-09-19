SUMMARY = "Haskell mime-types profiling library"
DESCRIPTION = "This package provides the Haskell mime-types profiling library."
LICENSE = "MIT"

PV = "0.1.2.2"

RPM_NAME = "ghc-mime-types-prof-0.1.2.2-1.2.aarch64.rpm"
RPM_HASH = "bc90975a7c1f30546baad4426bc725d4b513539c21b63979f218282d560e9a91653c8023b84109702024f12fa33e1f9079cf42343bfd88ae8f8407556a25dd27"

RPROVIDES:${PN} += "ghc-mime-types-prof \
ghc-prof-mime-types-0.1.2.2-6XnqAsimqz1GLkPrdggNkp"

RDEPENDS:${PN} += "ghc-mime-types-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
