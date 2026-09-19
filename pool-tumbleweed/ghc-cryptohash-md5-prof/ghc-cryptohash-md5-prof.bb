SUMMARY = "Haskell cryptohash-md5 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-prof-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "6e6d3d87532ee2ff1cafb936736639985a44434c52f6afbb7034f9fcf99e9dbf9e2e6e578a5832aa8aec12eff615773c63eabe615c19704e63d034f6112bdb6a"

RPROVIDES:${PN} += "ghc-cryptohash-md5-prof \
ghc-prof-cryptohash-md5-0.11.101.0-BL71FgcwkvtHLdWrK6WsDS"

RDEPENDS:${PN} += "ghc-cryptohash-md5-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
