SUMMARY = "Haskell cryptohash-sha256 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-prof-0.11.102.1-7.15.aarch64.rpm"
RPM_HASH = "a055c8c52e5c659a88c86d835a87eea81b42dd68747327769b51c5b6094baadfe99ace7cf27ed06e6dbbd80a473047c4220c359ab10e3584eabb0d088240bb73"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-prof \
ghc-prof-cryptohash-sha256-0.11.102.1-23ttH0Xv2YGR2bm1AVxTX"

RDEPENDS:${PN} += "ghc-cryptohash-sha256-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
