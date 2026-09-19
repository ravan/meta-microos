SUMMARY = "Documentation for texlive-productbox"
DESCRIPTION = "This package includes the documentation for texlive-productbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn20886"

RPM_NAME = "texlive-productbox-doc-2026.226.1.1svn20886-59.2.noarch.rpm"
RPM_HASH = "1c6b151048ee2265ad9d9b49e40c0ef5535e667c566848659eb1a3242d27e4c0c11dadea7e337777d630e4e76e91dcd7d89c598a8e2651a2dd2368bec6dd87c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-productbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
