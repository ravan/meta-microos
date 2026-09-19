SUMMARY = "Documentation for texlive-knittingpattern"
DESCRIPTION = "This package includes the documentation for texlive-knittingpattern"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17205"

RPM_NAME = "texlive-knittingpattern-doc-2026.226.svn17205-63.2.noarch.rpm"
RPM_HASH = "cf0627b29efa9fa4b07659d36c78a158d51f105955a7c1cae8fe90dc5d52ca54c3bad072a8175338ad4cf14a2b0a389ff9fab03166bce0424e45f921f0966f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knittingpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
