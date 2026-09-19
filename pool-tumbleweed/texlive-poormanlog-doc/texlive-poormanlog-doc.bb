SUMMARY = "Documentation for texlive-poormanlog"
DESCRIPTION = "This package includes the documentation for texlive-poormanlog"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-poormanlog-doc-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "40516fb398a36f57d2a9daec6c343f632fb5d88f0fd54d9e24fe1cc0a1c953e6388dc5c5bdba9ee7911814358e9206eecb71655db07395587e723e591ffb8098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poormanlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
