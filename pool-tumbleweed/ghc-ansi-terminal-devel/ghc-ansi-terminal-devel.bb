SUMMARY = "Haskell ansi-terminal library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "ghc-ansi-terminal-devel-1.1.5-1.7.aarch64.rpm"
RPM_HASH = "f8f5d68d17fe06ecdb1b00dadbb1dafcdf8429f09a44f2fb8ae64f96220b587d1fa101ff454f0eeea7928b865c6c9c3c76f37ed9914c8cb5e152f563ec1101f7"

RPROVIDES:${PN} += "ghc-ansi-terminal-devel \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-terminal \
ghc-compiler \
ghc-devel-ansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

inherit rpm
