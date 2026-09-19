SUMMARY = "Haskell regex-tdfa profiling library"
DESCRIPTION = "This package provides the Haskell regex-tdfa profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.5"

RPM_NAME = "ghc-regex-tdfa-prof-1.3.2.5-1.9.aarch64.rpm"
RPM_HASH = "e10734d922bc3c41c623184953fb7128d40b72d4e865fa6600df0f814d39a29def3c6d4de4da95224cd76c60a1857edb91333c1258630b876cb1aa4437a878ee"

RPROVIDES:${PN} += "ghc-prof-regex-tdfa-1.3.2.5-DS5gfI36p0L6e0JJtc3gfd \
ghc-regex-tdfa-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-regex-base-0.94.0.3-1XPR6520nrRCZPbnaVzsF0 \
ghc-prof-text-2.1.4-cf23 \
ghc-regex-tdfa-devel"

inherit rpm
