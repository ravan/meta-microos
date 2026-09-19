SUMMARY = "Documentation for texlive-liturgy-cw"
DESCRIPTION = "This package includes the documentation for texlive-liturgy-cw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76053"

RPM_NAME = "texlive-liturgy-cw-doc-2026.226.0.0.3svn76053-61.2.noarch.rpm"
RPM_HASH = "26a8ced5204d0a6c07d75aba9ae2a8c47013890292c59f2ad513918062961b2914e999e2711aaf05968a5dd3ef57d81773c8e7da188656dcda2bfbe5d1c20b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liturgy-cw-doc"

RDEPENDS:${PN} += ""

inherit rpm
