SUMMARY = "Cross-platform FreeType bindings for .NET"
DESCRIPTION = "SharpFont is a library that provides FreeType bindings for .NET. \
Everything from format-specific APIs to the caching subsystem are included."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "sharpfont-devel-4.0.1-1.15.noarch.rpm"
RPM_HASH = "1bb1cd38c291ddb3107fde1c74d0d8ca6efbccb1dee31aeabcb03886c78eaff2438f45d395a7950ce3278451e89c9f6ee5fd01852cf05bb0b83bd6af5d59931d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-sharpfont \
sharpfont-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
sharpfont"

inherit rpm
