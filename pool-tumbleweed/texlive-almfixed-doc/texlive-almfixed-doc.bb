SUMMARY = "Documentation for texlive-almfixed"
DESCRIPTION = "This package includes the documentation for texlive-almfixed"
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.92svn35065"

RPM_NAME = "texlive-almfixed-doc-2026.226.0.0.92svn35065-61.2.noarch.rpm"
RPM_HASH = "a5686df3de967b25e89fb53f9900b55508f74356053ba1db6202bca9c00c8f3a59618987d6de80f15c2ca6c3bb141935b725f64e3991f722ec455f4b71997fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-almfixed-doc"

RDEPENDS:${PN} += ""

inherit rpm
