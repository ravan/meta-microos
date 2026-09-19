SUMMARY = "Documentation for texlive-rulerbox"
DESCRIPTION = "This package includes the documentation for texlive-rulerbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn50984"

RPM_NAME = "texlive-rulerbox-doc-2026.226.1.01svn50984-60.2.noarch.rpm"
RPM_HASH = "53941ba5df8e16a116e2a14e438c3c9ff8b7570130f7bc352c0d18e28de90e70532174d964167631c7dea782186b409d231e4ec6b84be9878b64414dbf4832db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulerbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
