SUMMARY = "Haskell text-conversions library development files"
DESCRIPTION = "This package provides the Haskell text-conversions library development \
files."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-devel-0.3.1.1-2.23.aarch64.rpm"
RPM_HASH = "8b287be0574ba035189842930c636bb02da267668c51e6bf6d43dcef15b5a73a52529ed319ee70348d9418d835985064fa2f447aac65d1f84827a4f47c41c70c"

RPROVIDES:${PN} += "ghc-devel-text-conversions-0.3.1.1-20nmORR03VHGl8svDWla5t \
ghc-text-conversions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-base16-bytestring-1.0.2.0-IiVu4f3aSfMH2rpDgRP1QL \
ghc-devel-base64-bytestring-1.2.1.0-9fPiMCS8Y4g8itFjJTGk2y \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-text-2.1.4-cf23 \
ghc-text-conversions"

inherit rpm
