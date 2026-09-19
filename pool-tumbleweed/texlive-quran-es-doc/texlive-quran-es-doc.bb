SUMMARY = "Documentation for texlive-quran-es"
DESCRIPTION = "This package includes the documentation for texlive-quran-es"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn74874"

RPM_NAME = "texlive-quran-es-doc-2026.226.0.0.11svn74874-60.4.noarch.rpm"
RPM_HASH = "91884cff10eeaa5cfbcc3f7145fdcf03dcbea0cd8bbe1e10dcfd19417db674bf94f6f48f07e0a6111f82a2915a04d983931f3c5e5e64e35162ef0fe58d4d473c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-es-doc"

RDEPENDS:${PN} += ""

inherit rpm
