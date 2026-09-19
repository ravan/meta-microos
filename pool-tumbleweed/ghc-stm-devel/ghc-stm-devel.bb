SUMMARY = "Haskell stm library development files"
DESCRIPTION = "This package provides the Haskell stm library development files."
LICENSE = "BSD-3-Clause"

PV = "2.5.3.1"

RPM_NAME = "ghc-stm-devel-2.5.3.1-1.3.aarch64.rpm"
RPM_HASH = "ccff86196948fa6a04588be67cbc2b417607e81c3bb0c2fec10653d3019ec25ce6fec94085c0e515ec446dcf0bc4fa435b57bb4c87b45ec92ddf887f023cbcba"

RPROVIDES:${PN} += "ghc-devel-stm-2.5.3.1-6d74 \
ghc-stm-devel \
ghc-stm-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-stm"

inherit rpm
