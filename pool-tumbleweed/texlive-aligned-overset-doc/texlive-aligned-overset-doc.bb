SUMMARY = "Documentation for texlive-aligned-overset"
DESCRIPTION = "This package includes the documentation for texlive-aligned-overset"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn77682"

RPM_NAME = "texlive-aligned-overset-doc-2026.226.0.0.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "d269aa942f4fbdcb8c5943b5d6fea7bef52b9cfa601f1e7e996628cd5916f9810fca733c5a596f61d0ba4989fc7860972c20adb55a318896d444a40edfd48e34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aligned-overset-doc"

RDEPENDS:${PN} += ""

inherit rpm
