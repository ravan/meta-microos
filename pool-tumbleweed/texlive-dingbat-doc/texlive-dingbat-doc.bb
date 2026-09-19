SUMMARY = "Documentation for texlive-dingbat"
DESCRIPTION = "This package includes the documentation for texlive-dingbat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-dingbat-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "c2af5815060f7a6932c28e5402cf5ce773945d70701134e7e5a4f3f01b98aa38e858711a4a3d34d050e3204b1180e4e59ea5b10d9aa2e387c7826fc52b600c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dingbat-doc"

RDEPENDS:${PN} += ""

inherit rpm
