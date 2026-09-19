SUMMARY = "Documentation for texlive-quran-de"
DESCRIPTION = "This package includes the documentation for texlive-quran-de"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn74874"

RPM_NAME = "texlive-quran-de-doc-2026.226.0.0.21svn74874-60.4.noarch.rpm"
RPM_HASH = "d544944789db82cd1dcc08b4c635b212723cbbd20a7eea6573088b39dc2a7d530da31bf4c688be40ccae1fdc91b7d42cd532637eed93e207539e470c8d9bd4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
