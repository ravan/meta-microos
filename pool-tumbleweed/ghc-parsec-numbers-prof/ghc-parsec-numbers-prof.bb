SUMMARY = "Haskell parsec-numbers profiling library"
DESCRIPTION = "This package provides the Haskell parsec-numbers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-prof-0.1.0-7.19.aarch64.rpm"
RPM_HASH = "d143cbc40b71e93bc6a48f7c177ca449a94224277991fbeac612a8fc73d30006a0475db27d8dfc4c23dc8b0fda793f6bda747a9c0e6bbaf5ab2d7310e7bc1dda"

RPROVIDES:${PN} += "ghc-parsec-numbers-prof \
ghc-prof-parsec-numbers-0.1.0-AMPF59BsE5W4SuUj5AhufY"

RDEPENDS:${PN} += "ghc-parsec-numbers-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-parsec-3.1.18.0-be05"

inherit rpm
