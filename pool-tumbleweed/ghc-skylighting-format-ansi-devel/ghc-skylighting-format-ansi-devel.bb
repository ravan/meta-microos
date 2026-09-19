SUMMARY = "Haskell skylighting-format-ansi library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-devel-0.1-2.80.aarch64.rpm"
RPM_HASH = "e3960c242f54fe9c1a518307fb7674337a2c2dcb9d2485149ddaec22398d157d95cc86ea21c35917d02addc709a493f64b0f99cdce4ce07b4ad202102ad3addb"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-ansi-0.1-CknB8O3hJJk2idRwuOLFgG \
ghc-skylighting-format-ansi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-1.1.5-KiVHPj6W9e81bxE9dBsVtZ \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-text-2.1.4-cf23 \
ghc-skylighting-format-ansi"

inherit rpm
