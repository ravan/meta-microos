SUMMARY = "Documentation for texlive-bondgraph"
DESCRIPTION = "This package includes the documentation for texlive-bondgraph"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21670"

RPM_NAME = "texlive-bondgraph-doc-2026.226.1.0svn21670-59.2.noarch.rpm"
RPM_HASH = "111c61be2bfcd2fea9be3498966f4db154e303f27b0bd079b238004533390e05fddc1215d10a646a6168b14d62cf0459858560b3e22b19ce22f8e46e309d99f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
