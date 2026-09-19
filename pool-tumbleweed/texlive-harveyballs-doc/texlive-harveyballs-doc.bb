SUMMARY = "Documentation for texlive-harveyballs"
DESCRIPTION = "This package includes the documentation for texlive-harveyballs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn32003"

RPM_NAME = "texlive-harveyballs-doc-2026.226.1.1svn32003-60.4.noarch.rpm"
RPM_HASH = "26bad7cb09331b55d5f33bbc5c8180266e7ddf9ec20c4eb80546ca12bfab925635c5c63a6c0f774ad2a72548420272b6cbd1983391ef466cedd280c66e09290c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harveyballs-doc"

RDEPENDS:${PN} += ""

inherit rpm
