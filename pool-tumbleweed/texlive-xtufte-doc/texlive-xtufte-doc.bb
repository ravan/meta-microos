SUMMARY = "Documentation for texlive-xtufte"
DESCRIPTION = "This package includes the documentation for texlive-xtufte"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn76952"

RPM_NAME = "texlive-xtufte-doc-2026.226.0.0.03svn76952-59.4.noarch.rpm"
RPM_HASH = "0ffa737f97675255078d31086ca90001ec39fc0de313d75bd5a88b4e80dd718d4f90b8d20246e7e46ce91fc4b6b978a3f4c0669f9c835c4c0ff004f2ae702b47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtufte-doc"

RDEPENDS:${PN} += ""

inherit rpm
