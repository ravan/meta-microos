SUMMARY = "Documentation for texlive-linearregression"
DESCRIPTION = "This package includes the documentation for texlive-linearregression"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-linearregression-doc-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "dd3bcc248b609792ac6b044f254271b6675c0f0fceec00f641f250b860f24720fcdefb5cc07bbb66814f489fcdd595524e7404e4bcbd2c877b0a0047385368cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linearregression-doc"

RDEPENDS:${PN} += ""

inherit rpm
