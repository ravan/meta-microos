SUMMARY = "Documentation for texlive-gloss-occitan"
DESCRIPTION = "This package includes the documentation for texlive-gloss-occitan"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-doc-2026.226.0.0.1svn52593-60.4.noarch.rpm"
RPM_HASH = "4f6e35ce8cea3845516c76bf225e5e3aa937fab08f0440473df19e396d9f35456fe999ad38ae5bf8095162c989e3dffa8e183fdbbefecc971ab71e39fe9c2ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
