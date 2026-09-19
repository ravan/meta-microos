SUMMARY = "Haskell cryptohash-sha1 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-prof-0.11.101.0-8.15.aarch64.rpm"
RPM_HASH = "b753bc6b22c230e5a487f8ea2448890d9f85779cc4b4bad698d9e85198044024743d38d42b6e691e3cfa1fbbdf621d9aae38b7e7ef7ec7436c55f8f33154a79c"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-prof \
ghc-prof-cryptohash-sha1-0.11.101.0-8eRxmtRH1AP4nYxJeWtthM"

RDEPENDS:${PN} += "ghc-cryptohash-sha1-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
