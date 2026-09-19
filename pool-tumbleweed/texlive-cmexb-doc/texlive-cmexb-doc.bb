SUMMARY = "Documentation for texlive-cmexb"
DESCRIPTION = "This package includes the documentation for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-cmexb-doc-2026.226.svn54074-60.2.noarch.rpm"
RPM_HASH = "02b9616b707c53a2f3a18c9a8b1aeb97775103f15b36f344989ca603d699d3f0cfe9e2e3fa807b1783c4625f4b3f65e5b2bfb44d5c069c1f814fb89e74853dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmexb-doc"

RDEPENDS:${PN} += ""

inherit rpm
