SUMMARY = "Documentation for texlive-frletter"
DESCRIPTION = "This package includes the documentation for texlive-frletter"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-frletter-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "775bc9197433b5bcba9b6ff9df06ccb0fc3e6f82f349654cf002b40abe8303e0d6575e9c87248e98c28619993cf6e3f8420bbb8cc0411b00dcfd9eaf5c6c5b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
