SUMMARY = "Documentation for texlive-ifallfalse"
DESCRIPTION = "This package includes the documentation for texlive-ifallfalse"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-doc-2026.226.2.0.0svn60027-60.2.noarch.rpm"
RPM_HASH = "80326d0d74d30acc6e7ca894bdf5103a14ad3611c65078133c7453e492ed49df57306ad07a85d30c7a64ae7edf44641fb3ec255b00df72d3b54c22eb1a44a53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifallfalse-doc"

RDEPENDS:${PN} += ""

inherit rpm
