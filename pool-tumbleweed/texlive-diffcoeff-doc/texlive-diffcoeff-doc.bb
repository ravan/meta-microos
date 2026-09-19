SUMMARY = "Documentation for texlive-diffcoeff"
DESCRIPTION = "This package includes the documentation for texlive-diffcoeff"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.6svn77682"

RPM_NAME = "texlive-diffcoeff-doc-2026.226.5.6svn77682-59.2.noarch.rpm"
RPM_HASH = "0890af6df05560844262bcfe29429ee48610ced6d33488e40694474fb812063d8d940a20b6421d1365fe700f0fde542ab6ef3c8dec2591528a0a079923921fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diffcoeff-doc"

RDEPENDS:${PN} += ""

inherit rpm
