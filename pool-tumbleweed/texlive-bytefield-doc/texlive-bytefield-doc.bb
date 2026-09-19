SUMMARY = "Documentation for texlive-bytefield"
DESCRIPTION = "This package includes the documentation for texlive-bytefield"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-bytefield-doc-2026.226.2.9svn77682-59.2.noarch.rpm"
RPM_HASH = "52325d24f7e9b4a2747a6e0329ae370ad62a094df6f32ab640c5c96d84836c744b20f7103d6f0a675898634c579860168e378f3bbb7b71cef2dfc2cf93c549a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bytefield-doc"

RDEPENDS:${PN} += ""

inherit rpm
