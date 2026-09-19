SUMMARY = "Documentation for texlive-path"
DESCRIPTION = "This package includes the documentation for texlive-path"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.05svn77682"

RPM_NAME = "texlive-path-doc-2026.226.3.05svn77682-58.2.noarch.rpm"
RPM_HASH = "e1ccfeddcfd496ebc724878485a6039956999a776b1bad93ea7bb837bee245f579541f2c6fb61bf67dfebd6150e37414919802356f71a9762fe7364b8c40bc5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-path-doc"

RDEPENDS:${PN} += ""

inherit rpm
