SUMMARY = "Documentation for texlive-xtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xtuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-doc-2026.226.1.0svn47049-59.4.noarch.rpm"
RPM_HASH = "fc5a4f8005682c3d6bc7172a667ad4478c2f98b58598f736147133e850a4927dbfee29d2dcf04602e69aa4568f56606b5cc832a475271283b3c4c7f17f24e7a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xtuthesis-doc-zh \
texlive-xtuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
