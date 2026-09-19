SUMMARY = "Documentation for texlive-alertmessage"
DESCRIPTION = "This package includes the documentation for texlive-alertmessage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-alertmessage-doc-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "bf1805f7bbc1838da51de2a478a181284a017ed42dd89d241cd4ab5e35472b0bb5dffed462706e6d7734f8ce28a6a3fd5deb84cde05ff193114544b85b0a9827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alertmessage-doc"

RDEPENDS:${PN} += ""

inherit rpm
