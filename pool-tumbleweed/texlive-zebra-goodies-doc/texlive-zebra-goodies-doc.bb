SUMMARY = "Documentation for texlive-zebra-goodies"
DESCRIPTION = "This package includes the documentation for texlive-zebra-goodies"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78163"

RPM_NAME = "texlive-zebra-goodies-doc-2026.226.0.0.9.1svn78163-59.4.noarch.rpm"
RPM_HASH = "99ce1d284196d4da6ff391f7ccd85090fbae289d43883f2b584432f4af4ae3dd8b8e9baf1e7e90a567624ae74da431360cd01088b7ee998bb742a9f407f82f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zebra-goodies-doc"

RDEPENDS:${PN} += ""

inherit rpm
