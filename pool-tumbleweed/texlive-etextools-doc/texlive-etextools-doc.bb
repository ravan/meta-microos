SUMMARY = "Documentation for texlive-etextools"
DESCRIPTION = "This package includes the documentation for texlive-etextools"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415926svn20694"

RPM_NAME = "texlive-etextools-doc-2026.226.3.1415926svn20694-59.2.noarch.rpm"
RPM_HASH = "a1ce08587b75b325dd58547a49ac4068105e7d7956bdef8d1c737dadc4b3d64ff766c9585c83b852780fdd64d42d8ba66655b600e380ffacfeb07ae94b12ff09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
