SUMMARY = "Documentation for texlive-hep-text"
DESCRIPTION = "This package includes the documentation for texlive-hep-text"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-text-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "c4a291dc189ad03337c083ef929c7646c87d3e6519e05e311d60fc48b1baeacf927d5e6b62741079a61a1e7ce99297741447e8cd113033256da5fac32a9a17b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
