SUMMARY = "Haskell ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "ghc-ansi-terminal-prof-1.1.5-1.7.aarch64.rpm"
RPM_HASH = "85128adb308801486c8f92d772c98df97836a5e5abfb2b40ebc76342ebe3f39aaec23a42b0f47cea46fa7bc2bdb2d650e90bf160fe9166e4733eeabae1ec06c6"

RPROVIDES:${PN} += "ghc-ansi-terminal-prof \
ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ"

RDEPENDS:${PN} += "ghc-ansi-terminal-devel \
ghc-prof-ansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

inherit rpm
