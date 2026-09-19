SUMMARY = "Documentation for texlive-simplecd"
DESCRIPTION = "This package includes the documentation for texlive-simplecd"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn29260"

RPM_NAME = "texlive-simplecd-doc-2026.226.1.4svn29260-60.2.noarch.rpm"
RPM_HASH = "e2f822b19bfdc2d702396887b63662b65e037e055813e5119e3c8fcbf9c2879d6f34bfa88e72bfe177dafca6203cd8f3abb84db0253fc08aaf714b3497297c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecd-doc"

RDEPENDS:${PN} += ""

inherit rpm
