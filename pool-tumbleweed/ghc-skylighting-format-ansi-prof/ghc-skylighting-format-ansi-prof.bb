SUMMARY = "Haskell skylighting-format-ansi profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-prof-0.1-2.80.aarch64.rpm"
RPM_HASH = "c4a11288ae1afab838a74b14785dc06d1a789136c3a232dc5a11474270e10e217e70404c12dca621a452c9bbf41bd0b17d4b98520b202c711f19d7884fb8cc4b"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-ansi-0.1-CknB8O3hJJk2idRwuOLFgG \
ghc-skylighting-format-ansi-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-text-2.1.4-cf23 \
ghc-skylighting-format-ansi-devel"

inherit rpm
