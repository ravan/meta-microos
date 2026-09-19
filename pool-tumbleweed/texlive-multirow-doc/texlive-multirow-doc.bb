SUMMARY = "Documentation for texlive-multirow"
DESCRIPTION = "This package includes the documentation for texlive-multirow"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-multirow-doc-2026.226.2.9svn77682-61.2.noarch.rpm"
RPM_HASH = "dc20afb637c79c9f96b47bcd94f8c282812bae29d7d13fc75da0fe98d835eafaa2b8e93ea95d3bfa3cf05f0a50550d0fa6572eadf307947664841ea3297ad2a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multirow-doc"

RDEPENDS:${PN} += ""

inherit rpm
