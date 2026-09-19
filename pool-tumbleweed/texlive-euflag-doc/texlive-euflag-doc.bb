SUMMARY = "Documentation for texlive-euflag"
DESCRIPTION = "This package includes the documentation for texlive-euflag"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn55265"

RPM_NAME = "texlive-euflag-doc-2026.226.0.0.8svn55265-59.2.noarch.rpm"
RPM_HASH = "bfb7035d2676fab602ab31828ca4f775254588af71dc289d355fc4f73f7dc63eb86a5d5bf87070e2715ca2913478a0e4973017a0bb0a7273d10e60f7fe5d40e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euflag-doc"

RDEPENDS:${PN} += ""

inherit rpm
