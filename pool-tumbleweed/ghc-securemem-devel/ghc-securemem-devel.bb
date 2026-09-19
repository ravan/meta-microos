SUMMARY = "Haskell securemem library development files"
DESCRIPTION = "This package provides the Haskell securemem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-devel-0.1.10-4.25.aarch64.rpm"
RPM_HASH = "3aad670d512691b2ec37ad3dce5c4dc64786ecdd4da6bea82ea93775e4276e25d0ce19355f518e3bdb754de5bc11a4074a57f4416334b4f3d7f1ecf919f910c3"

RPROVIDES:${PN} += "ghc-devel-securemem-0.1.10-3X8hOwUdNWpLbNN8DRIHnH \
ghc-securemem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-byteable-0.1.1-9wX3TD5RsfdJZP8DobkPHo \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-securemem"

inherit rpm
