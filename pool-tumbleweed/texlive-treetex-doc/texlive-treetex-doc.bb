SUMMARY = "Documentation for texlive-treetex"
DESCRIPTION = "This package includes the documentation for texlive-treetex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28176"

RPM_NAME = "texlive-treetex-doc-2026.226.svn28176-59.2.noarch.rpm"
RPM_HASH = "84a43996fc4c78337a0d1a0191289b44b965f73b0aae4de7cc05cb097bd3361f34704ef8c3432528bec75ac4445e031535a79785b157c8f7edd6ecacb5fb5fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-treetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
