SUMMARY = "Documentation for texlive-knitting"
DESCRIPTION = "This package includes the documentation for texlive-knitting"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn50782"

RPM_NAME = "texlive-knitting-doc-2026.226.3.0svn50782-63.2.noarch.rpm"
RPM_HASH = "a1ee8addc90c7a6fffc0f07b2fccab7d2c8fe2cb21e42f68f1754e02bec16a1c1663cfffee3f75558f5e517791f83a2a9d7c2efecc7f84464e2521aad876e51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knitting-doc"

RDEPENDS:${PN} += ""

inherit rpm
