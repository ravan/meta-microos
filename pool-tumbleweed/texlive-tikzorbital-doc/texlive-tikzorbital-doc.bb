SUMMARY = "Documentation for texlive-tikzorbital"
DESCRIPTION = "This package includes the documentation for texlive-tikzorbital"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn36439"

RPM_NAME = "texlive-tikzorbital-doc-2026.226.svn36439-59.2.noarch.rpm"
RPM_HASH = "f9553693130659712913378c2e29375ce545ed2e4528b18c6f71c9c342fa488743b3e89d1f35d89a80eac49ecad146884bf7f81a78c7cbf93adc6b0965daf363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzorbital-doc"

RDEPENDS:${PN} += ""

inherit rpm
