SUMMARY = "Documentation for texlive-fodot"
DESCRIPTION = "This package includes the documentation for texlive-fodot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76255"

RPM_NAME = "texlive-fodot-doc-2026.226.0.0.0.1svn76255-60.2.noarch.rpm"
RPM_HASH = "c3c81234e945cdae9d56b0bfcdbf79b5f0e5f8b02227117141db5ad5603ffdd7a2e2d4fea0922911f16bca888dc51e2ad602b96aaae6eb94b226a7649e8a7cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fodot-doc"

RDEPENDS:${PN} += ""

inherit rpm
