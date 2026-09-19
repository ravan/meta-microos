SUMMARY = "Haskell crypton-socks profiling library"
DESCRIPTION = "This package provides the Haskell crypton-socks profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "ghc-crypton-socks-prof-0.6.2-1.10.aarch64.rpm"
RPM_HASH = "2c002754e32d52be59a17bf0d2271a367f9002b7a97fd63cb5d0da17ef4a5735cb4081c4abab67d5850fececd184c7f1e8e853574f272764f9c7de0a068734e6"

RPROVIDES:${PN} += "ghc-crypton-socks-prof \
ghc-prof-crypton-socks-0.6.2-ArLwOvrWYIxHawSNyZavl9"

RDEPENDS:${PN} += "ghc-crypton-socks-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI"

inherit rpm
