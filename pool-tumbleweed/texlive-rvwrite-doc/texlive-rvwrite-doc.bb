SUMMARY = "Documentation for texlive-rvwrite"
DESCRIPTION = "This package includes the documentation for texlive-rvwrite"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn19614"

RPM_NAME = "texlive-rvwrite-doc-2026.226.1.2svn19614-60.2.noarch.rpm"
RPM_HASH = "a01188737b6714fce6740952a289972b52d741be6dcbc0d381689625b1a788ac6d21324a65c909ac8df3010a4d2dc9354cbf949904edee9486b82122d43d7d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rvwrite-doc"

RDEPENDS:${PN} += ""

inherit rpm
