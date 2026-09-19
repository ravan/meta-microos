SUMMARY = "Documentation for texlive-thuthesis"
DESCRIPTION = "This package includes the documentation for texlive-thuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.227.7.6.0svn74775"

RPM_NAME = "texlive-thuthesis-doc-2026.227.7.6.0svn74775-62.2.noarch.rpm"
RPM_HASH = "9301619310f62a964af1ee3073eeb823c1559bbdcf2e1d1b4cdedafa76e3ef6e063a7458e90f3ca0a2fa9ce249d79aa611b6c2e4bd97ea0183037143c9f9d5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thuthesis-doc-zh \
texlive-thuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
