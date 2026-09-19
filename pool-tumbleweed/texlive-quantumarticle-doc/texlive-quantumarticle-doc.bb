SUMMARY = "Documentation for texlive-quantumarticle"
DESCRIPTION = "This package includes the documentation for texlive-quantumarticle"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-doc-2026.226.6.1svn65242-60.4.noarch.rpm"
RPM_HASH = "6989547c44d58eb99164aeb58c8ff3f9b9bdc34f4d145517030a30b0c9e9d9266e0b86b938b06a9d2d46a1e9732e38d24b253045b339024520e9cb061a25644d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantumarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
