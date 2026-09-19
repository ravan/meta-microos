SUMMARY = "Documentation for texlive-cantarell"
DESCRIPTION = "This package includes the documentation for texlive-cantarell"
LICENSE = "OFL-1.1"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-cantarell-doc-2026.226.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "6c931f60d6c57eafeb4b32fd5d30ec7e5df0a42808fe91f33010915aaadec1112e1205d925d80436e9726f972b47f338a806f69ef6ddd3b30a718f115bbbdede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cantarell-doc"

RDEPENDS:${PN} += ""

inherit rpm
