SUMMARY = "Haskell data-default profiling library"
DESCRIPTION = "This package provides the Haskell data-default profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.2"

RPM_NAME = "ghc-data-default-prof-0.8.0.2-1.3.aarch64.rpm"
RPM_HASH = "27f07821a3eec46d5ceec6fc3fc4e552d9d5df1d155c2a2879eccc9f7b45e54bdda604df652e44da0f489b3995905a75283ee063461a4aadffb8036ed152ddae"

RPROVIDES:${PN} += "ghc-data-default-prof \
ghc-prof-data-default-0.8.0.2-E5U3DddOalL1fqy98B4vdZ"

RDEPENDS:${PN} += "ghc-data-default-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1"

inherit rpm
