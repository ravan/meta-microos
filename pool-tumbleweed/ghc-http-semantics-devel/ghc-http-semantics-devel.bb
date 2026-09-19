SUMMARY = "Haskell http-semantics library development files"
DESCRIPTION = "This package provides the Haskell http-semantics library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-http-semantics-devel-0.3.0-1.16.aarch64.rpm"
RPM_HASH = "57328b4e26d6ffffec092e2c94e564ea24259ff194daaecff54e1bc22002b9e6d87a66cf786620be264e745573f317150c0964963f4c27ee470abf650f92c329"

RPROVIDES:${PN} += "ghc-devel-http-semantics-0.3.0-D5AfX4HSpBm3DHrTNQ2Sqe \
ghc-http-semantics-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.8.0-2a42 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-devel-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-devel-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-http-semantics"

inherit rpm
