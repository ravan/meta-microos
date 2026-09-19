SUMMARY = "Documentation for texlive-charissil"
DESCRIPTION = "This package includes the documentation for texlive-charissil"
LICENSE = "OFL-1.1"

PV = "2026.226.6.101svn64998"

RPM_NAME = "texlive-charissil-doc-2026.226.6.101svn64998-60.2.noarch.rpm"
RPM_HASH = "6ff87909e7b88bd11dacd4c98d61d9b0f9a64f1a58fb3fb1e6edc7c4aaa80eb44c2f4af086e06ea05da0f55d1da877a36ff0a286e97b8d3bb081905e07105b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charissil-doc"

RDEPENDS:${PN} += ""

inherit rpm
