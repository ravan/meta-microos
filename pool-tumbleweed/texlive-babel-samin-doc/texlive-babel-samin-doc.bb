SUMMARY = "Documentation for texlive-babel-samin"
DESCRIPTION = "This package includes the documentation for texlive-babel-samin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77682"

RPM_NAME = "texlive-babel-samin-doc-2026.226.1.0dsvn77682-60.2.noarch.rpm"
RPM_HASH = "973c4a3cdce5502ab8825b731fff059f33c87344e67f414482d99399e6145d12ccbdf92279f7eb70556231e7ff684e82626fad8e4081d9955eccca1fd6183fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-samin-doc"

RDEPENDS:${PN} += ""

inherit rpm
