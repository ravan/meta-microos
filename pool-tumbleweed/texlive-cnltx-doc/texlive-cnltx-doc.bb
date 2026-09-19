SUMMARY = "Documentation for texlive-cnltx"
DESCRIPTION = "This package includes the documentation for texlive-cnltx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn76924"

RPM_NAME = "texlive-cnltx-doc-2026.226.0.0.15svn76924-60.2.noarch.rpm"
RPM_HASH = "a7c0675c9f3e09c450d3a23d495649e0ff9012fb2bbbed58aab838204c3aab14a227ff08b53a5b2c5967124f33973fa7de36deed3f5e7fba0abf5756c65f0a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
