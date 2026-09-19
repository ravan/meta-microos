SUMMARY = "Documentation for texlive-texosquery"
DESCRIPTION = "This package includes the documentation for texlive-texosquery"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.7svn77682"

RPM_NAME = "texlive-texosquery-doc-2026.227.1.7svn77682-62.2.noarch.rpm"
RPM_HASH = "57cd4a129478527cac827241c59ac43d2f5ccb8f7fa4ade5bd4e420de4075d9e2d03abfcc9d9e84cfcb9cd14cf0d4b999e6e7fb9233815de460cd8b8cf328ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texosquery-doc"

RDEPENDS:${PN} += ""

inherit rpm
