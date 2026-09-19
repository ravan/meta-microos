SUMMARY = "Haskell ech-config library development files"
DESCRIPTION = "This package provides the Haskell ech-config library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-ech-config-devel-0.0.1-2.2.aarch64.rpm"
RPM_HASH = "bb978eec6550deb18a98fdba644cee725e70c54c1475873e15a22e7381c608119a9997fb10a8a8e0c69da2b63387286a0a8787756fb053322d8252677a4a2033"

RPROVIDES:${PN} += "ghc-devel-ech-config-0.0.1-Dq8pFxp7oP5KsTo31dxOND \
ghc-ech-config-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-ech-config"

inherit rpm
