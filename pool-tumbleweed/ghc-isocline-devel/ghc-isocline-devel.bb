SUMMARY = "Haskell isocline library development files"
DESCRIPTION = "This package provides the Haskell isocline library development files."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-devel-1.0.9-3.12.aarch64.rpm"
RPM_HASH = "18b0e47f170e246f846233f018dfc78d9aa19ca33143974967ed741f4758ba2dd09d4365265cc7a7d39f737f136773bcb06d3d651f74bb9be1056e91f018015a"

RPROVIDES:${PN} += "ghc-devel-isocline-1.0.9-1LtJKbO57TxJAL2UMR5S4N \
ghc-isocline-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23 \
ghc-isocline"

inherit rpm
