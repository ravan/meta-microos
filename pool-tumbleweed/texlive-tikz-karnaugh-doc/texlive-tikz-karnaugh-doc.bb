SUMMARY = "Documentation for texlive-tikz-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-tikz-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn62040"

RPM_NAME = "texlive-tikz-karnaugh-doc-2026.226.1.5svn62040-59.2.noarch.rpm"
RPM_HASH = "9287afe4c1e0959c117c37ec1af542ebf5c77b75a4fa45f981e6c0ee393ef75aaccd500e0b709d18932dc4270e56599a7c476e324dbcd43a174656e1e4c8546d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-karnaugh-doc"

RDEPENDS:${PN} += ""

inherit rpm
