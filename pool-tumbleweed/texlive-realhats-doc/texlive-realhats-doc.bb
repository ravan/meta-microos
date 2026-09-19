SUMMARY = "Documentation for texlive-realhats"
DESCRIPTION = "This package includes the documentation for texlive-realhats"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.1svn66924"

RPM_NAME = "texlive-realhats-doc-2026.226.7.1svn66924-60.4.noarch.rpm"
RPM_HASH = "c0f24a40c46c672e296a895e69937d6c35a0359ef29d557cda5d04e0d44adb0f503fc710f78badcff5703b76263645be809c03c2d4af10f6c9e7e172f2f84e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realhats-doc"

RDEPENDS:${PN} += ""

inherit rpm
