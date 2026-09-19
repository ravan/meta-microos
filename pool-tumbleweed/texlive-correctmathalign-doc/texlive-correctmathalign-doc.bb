SUMMARY = "Documentation for texlive-correctmathalign"
DESCRIPTION = "This package includes the documentation for texlive-correctmathalign"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.1svn44131"

RPM_NAME = "texlive-correctmathalign-doc-2026.226.1.1svn44131-61.2.noarch.rpm"
RPM_HASH = "dab9719bfe9110bce40a35f53cc83d72e300648fd76e6b81be5af6298762591aba651f80933ed2d609d1f99ae6a7e32a078d4bec41519a8004a7c61b4eb470b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-correctmathalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
