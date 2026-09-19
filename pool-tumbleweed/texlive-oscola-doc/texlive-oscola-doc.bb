SUMMARY = "Documentation for texlive-oscola"
DESCRIPTION = "This package includes the documentation for texlive-oscola"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77682"

RPM_NAME = "texlive-oscola-doc-2026.226.1.7svn77682-61.2.noarch.rpm"
RPM_HASH = "c76ec6a2101f4c520c7b1105c9974ecd4fb954bd0e934866b811e5ed45691d9806e311427c5df4c9c0b4d13c810a0c3c58457b53d5e87f06c992ac4e25e14e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oscola-doc"

RDEPENDS:${PN} += ""

inherit rpm
