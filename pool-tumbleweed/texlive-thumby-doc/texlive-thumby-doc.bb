SUMMARY = "Documentation for texlive-thumby"
DESCRIPTION = "This package includes the documentation for texlive-thumby"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.1svn16736"

RPM_NAME = "texlive-thumby-doc-2026.227.0.0.1svn16736-62.2.noarch.rpm"
RPM_HASH = "30dcef6bc648d58cbff06e77e1e26fac7a91089afb4372c2809692bd82a6bd12c75147d9a0a334d83908593641c219f9c0a6df41c8137c6a16b14d73943a64cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumby-doc"

RDEPENDS:${PN} += ""

inherit rpm
