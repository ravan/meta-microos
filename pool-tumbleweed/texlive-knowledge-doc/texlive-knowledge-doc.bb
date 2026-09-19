SUMMARY = "Documentation for texlive-knowledge"
DESCRIPTION = "This package includes the documentation for texlive-knowledge"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn76924"

RPM_NAME = "texlive-knowledge-doc-2026.226.1.31svn76924-63.2.noarch.rpm"
RPM_HASH = "c7316a6ec3e0bb381bffd308fe8f9ee9de3da4f41ffa89429af32b0e2e69634384d4953ca1ec2fff97f9dc7bf8e1b641e1f5faf93535362c13c018bbe96865f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knowledge-doc"

RDEPENDS:${PN} += ""

inherit rpm
