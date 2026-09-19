SUMMARY = "Haskell ansi-terminal-types profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-ansi-terminal-types-prof-1.1.3-1.10.aarch64.rpm"
RPM_HASH = "5bdc4dd33285b74d9f8f30b8cd9dc299dfdd5f6a0d88622618e0b7bb57350a3af1e2745463f25652c63693d7eca5cc345fb802cc069525d34a8d89df4f522923"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-prof \
ghc-prof-ansi-terminal-types-1.1.3-Cca3c5mUWg4AnUjMARf0p6"

RDEPENDS:${PN} += "ghc-ansi-terminal-types-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c"

inherit rpm
