SUMMARY = "Documentation for texlive-sdrt"
DESCRIPTION = "This package includes the documentation for texlive-sdrt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-sdrt-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "7f4cb043ef6c7b1fd07cc85ed99dfb8aed5855f779ac35e1decac937a675490f5d5e31803563ede7e2380b6666c36d7a74961d250af7044bc4d4aaff97d70306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdrt-doc"

RDEPENDS:${PN} += ""

inherit rpm
