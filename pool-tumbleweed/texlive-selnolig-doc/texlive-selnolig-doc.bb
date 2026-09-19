SUMMARY = "Documentation for texlive-selnolig"
DESCRIPTION = "This package includes the documentation for texlive-selnolig"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.302svn77682"

RPM_NAME = "texlive-selnolig-doc-2026.226.0.0.302svn77682-60.2.noarch.rpm"
RPM_HASH = "deeefe4e1a2b425ca4572de0d000c39fb18c7088e8f108bb7f726856e971b54766590799efc75dd707b2a068918b8097b2964e92e03af0d67ce45dbc3d155928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selnolig-doc"

RDEPENDS:${PN} += ""

inherit rpm
