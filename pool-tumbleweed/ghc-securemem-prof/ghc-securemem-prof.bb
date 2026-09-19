SUMMARY = "Haskell securemem profiling library"
DESCRIPTION = "This package provides the Haskell securemem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-prof-0.1.10-4.25.aarch64.rpm"
RPM_HASH = "9d08098c47648d9c4b6f0df8c2f7ad6ec8ae1d6367ef4f134c62e92c74b3ecf193fa88c57eb298bec7086066196a8e116e4b905a2fc86b7798d25ed0c4cc9609"

RPROVIDES:${PN} += "ghc-prof-securemem-0.1.10-3X8hOwUdNWpLbNN8DRIHnH \
ghc-securemem-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-securemem-devel"

inherit rpm
