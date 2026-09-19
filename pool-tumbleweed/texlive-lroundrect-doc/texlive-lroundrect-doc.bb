SUMMARY = "Documentation for texlive-lroundrect"
DESCRIPTION = "This package includes the documentation for texlive-lroundrect"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39804"

RPM_NAME = "texlive-lroundrect-doc-2026.226.1.0svn39804-61.2.noarch.rpm"
RPM_HASH = "038d98da5635310710969490d10da6be65fedfd186c9b41f266465a978eb6c3ee381c67a777c4c196e694ecf3cef08608a939997b060c118aaed6b84c7d1f4e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lroundrect-doc"

RDEPENDS:${PN} += ""

inherit rpm
