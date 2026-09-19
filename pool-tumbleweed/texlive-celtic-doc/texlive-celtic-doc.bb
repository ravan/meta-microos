SUMMARY = "Documentation for texlive-celtic"
DESCRIPTION = "This package includes the documentation for texlive-celtic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn39797"

RPM_NAME = "texlive-celtic-doc-2026.226.1.1svn39797-59.2.noarch.rpm"
RPM_HASH = "985f16e17fbb48ace8a728c48e6557843a3337437322dc6ab8a3b6f05c290b91d08ad2d494b6eb555619a63080ae3cf4260a61bc78f35969d77f91eaf402cc7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-celtic-doc"

RDEPENDS:${PN} += ""

inherit rpm
