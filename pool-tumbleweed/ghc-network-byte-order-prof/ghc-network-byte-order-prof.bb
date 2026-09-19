SUMMARY = "Haskell network-byte-order profiling library"
DESCRIPTION = "This package provides the Haskell network-byte-order profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-network-byte-order-prof-0.1.8-1.2.aarch64.rpm"
RPM_HASH = "90fd4efdf92d19c4059fde1fe99f5e104968e14965830f29420a6b8a8c1afc1a7f3a19942398ca20f782be02d836125c208bdfa580f3bc5d75d559716ffe976e"

RPROVIDES:${PN} += "ghc-network-byte-order-prof \
ghc-prof-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18"

RDEPENDS:${PN} += "ghc-network-byte-order-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
