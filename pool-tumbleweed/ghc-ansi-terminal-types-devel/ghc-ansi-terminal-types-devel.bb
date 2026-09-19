SUMMARY = "Haskell ansi-terminal-types library development files"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-ansi-terminal-types-devel-1.1.3-1.10.aarch64.rpm"
RPM_HASH = "b475a6ac86555749630b1cfaeb084b15962ce5780dd25c9eb55ef037b5fbaf37e98646930b1c395e8f151a1c37872e865b8897a25b341bbbcb7a892f0912d3bc"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-devel \
ghc-devel-ansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-terminal-types \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

inherit rpm
