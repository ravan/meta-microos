SUMMARY = "Haskell http-semantics profiling library"
DESCRIPTION = "This package provides the Haskell http-semantics profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-http-semantics-prof-0.3.0-1.16.aarch64.rpm"
RPM_HASH = "59aa655e8811f7e8b03166759b032b7084dd021ad7247668dff05d7bf47417bb985b5f63eb2499c96436fca096023bad199f7f5da02d4750db580c7115422b42"

RPROVIDES:${PN} += "ghc-http-semantics-prof \
ghc-prof-http-semantics-0.3.0-D5AfX4HSpBm3DHrTNQ2Sqe"

RDEPENDS:${PN} += "ghc-http-semantics-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-case-insensitive-1.2.1.0-8WhhA2fjmpX8lBECkgmLqC \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-network-3.2.8.0-HuXYLk4qLzHK9Hhg0VTDpI \
ghc-prof-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-prof-time-manager-0.2.4-H8vBuVTBThX7XPtYuadAK4 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
