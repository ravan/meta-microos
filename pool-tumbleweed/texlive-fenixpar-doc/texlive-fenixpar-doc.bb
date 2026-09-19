SUMMARY = "Documentation for texlive-fenixpar"
DESCRIPTION = "This package includes the documentation for texlive-fenixpar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn24730"

RPM_NAME = "texlive-fenixpar-doc-2026.226.0.0.92svn24730-59.2.noarch.rpm"
RPM_HASH = "a82b5f18699c3884e5ccd3ae0bc20f07f78dad119cc75faeef84b87297f02ad03e6647ed5b067b13f05241e462fc647344963b6e16765dada1b88c68a115b88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fenixpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
