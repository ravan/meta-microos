SUMMARY = "Documentation for texlive-urwchancal"
DESCRIPTION = "This package includes the documentation for texlive-urwchancal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn21701"

RPM_NAME = "texlive-urwchancal-doc-2026.226.1svn21701-60.2.noarch.rpm"
RPM_HASH = "32d75172d56c5e9b6b5f023bc1266c6d604508eee65385beccc7581eabda4e20f7e34b6748b5eda1ef4327f84b7f338edcb61b3bf4e4131373858d343d610e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urwchancal-doc"

RDEPENDS:${PN} += ""

inherit rpm
