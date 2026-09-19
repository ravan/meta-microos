SUMMARY = "Documentation for texlive-datetime2-german"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn67201"

RPM_NAME = "texlive-datetime2-german-doc-2026.226.3.0svn67201-59.2.noarch.rpm"
RPM_HASH = "e8106175b0ff5ec0227f46e7337ce80fea6a80b20fb04f501b77e8964cbbe32f7c2bc1b53e58ae90ce5816ee4f85873a0d61c9d5d91f35a9779ca037c1b9117d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
