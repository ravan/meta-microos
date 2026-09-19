SUMMARY = "Cross-platform FreeType bindings for .NET"
DESCRIPTION = "SharpFont is a library that provides FreeType bindings for .NET. \
Everything from format-specific APIs to the caching subsystem are included."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "sharpfont-4.0.1-1.15.noarch.rpm"
RPM_HASH = "5659d216cf30f37240eb24ebdd2a8155f4b0a30f20f125535fbf6c897020b42a871f08a63ea27e4fbbcbe0d494a8b6828166c441e8624ea9547b21a27890ca48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-SharpFont \
sharpfont"

RDEPENDS:${PN} += "mono-System.Core \
mono-System.Drawing \
mono-mscorlib"

inherit rpm
