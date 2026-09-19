SUMMARY = "Haskell ech-config profiling library"
DESCRIPTION = "This package provides the Haskell ech-config profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-ech-config-prof-0.0.1-2.2.aarch64.rpm"
RPM_HASH = "165b121245f51ffc0ade12409714f52c7926acb191d2999f874fad00f20a0427603103d2b4ef123b4ae7e1895d7a382c03707ff17219b8a1f8003f87213aec46"

RPROVIDES:${PN} += "ghc-ech-config-prof \
ghc-prof-ech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND"

RDEPENDS:${PN} += "ghc-ech-config-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18"

inherit rpm
