SUMMARY = "Documentation for texlive-zhlipsum"
DESCRIPTION = "This package includes the documentation for texlive-zhlipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn54994"

RPM_NAME = "texlive-zhlipsum-doc-2026.226.1.2.0svn54994-59.4.noarch.rpm"
RPM_HASH = "10102dcd20e4eda6c3dcd31947b3c1fb62ce5956c7a8efab76eafe39ce1fafc07cac58087ba8b29ec8b7cb075dd4b186919d6f6363ce4f30aa7ecec80c6fb648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlipsum-doc-en;zh \
texlive-zhlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
