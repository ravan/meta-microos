SUMMARY = "Documentation for texlive-fontscripts"
DESCRIPTION = "This package includes the documentation for texlive-fontscripts"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn74247"

RPM_NAME = "texlive-fontscripts-doc-2026.226.0.0.3svn74247-60.2.noarch.rpm"
RPM_HASH = "08cb2de3b795baf170d8c61b3e90b4fb9c2f2fb0597d8ad3d39b24af82705cce6d34de7afa4ec4c271af8320a26efd50603d92cf499c654fe94bc6308a443299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
