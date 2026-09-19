SUMMARY = "Documentation for texlive-iaria"
DESCRIPTION = "This package includes the documentation for texlive-iaria"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78137"

RPM_NAME = "texlive-iaria-doc-2026.226.0.0.9.1svn78137-60.2.noarch.rpm"
RPM_HASH = "1211d56fb52879f077ca86dcd19c6efc55c6453452100fb0fe4f91ef18ae912b61d06e0708e09f811e79d5844f98f29bdd0475fa1725d9f79be05a4c990b8f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iaria-doc"

RDEPENDS:${PN} += ""

inherit rpm
