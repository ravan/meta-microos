SUMMARY = "Documentation for texlive-crossreftools"
DESCRIPTION = "This package includes the documentation for texlive-crossreftools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-crossreftools-doc-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "a12570b7cf9163bdb7cee3eb66975775a056977eefef550b504cc8b438411d461bccaec5c46e73addf7fbab757936f4582ca424e3bca67b338dc2943b9f6b9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossreftools-doc"

RDEPENDS:${PN} += ""

inherit rpm
