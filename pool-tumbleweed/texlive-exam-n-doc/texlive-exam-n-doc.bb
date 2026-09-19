SUMMARY = "Documentation for texlive-exam-n"
DESCRIPTION = "This package includes the documentation for texlive-exam-n"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-doc-2026.226.1.4.0svn64674-59.2.noarch.rpm"
RPM_HASH = "c235693e990b1bbdb4ceb6d9653306313e17ff64ff6ae928ab329dc39798e4b6e664e76aa8ed26461db65f9d62bb95b3b2383d03bc8e284c3388f7dd13455f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-n-doc"

RDEPENDS:${PN} += ""

inherit rpm
