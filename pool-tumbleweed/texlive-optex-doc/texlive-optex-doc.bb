SUMMARY = "Documentation for texlive-optex"
DESCRIPTION = "This package includes the documentation for texlive-optex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.19svn78109"

RPM_NAME = "texlive-optex-doc-2026.226.1.19svn78109-61.2.noarch.rpm"
RPM_HASH = "092202e33e47686acd2edc974d26e925c95154adc8fc4c0cce98c44ddc44244212463c98eb7184cf8e80786061ad71b75e3a4135a67ed804ce7ed2581f4c8a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-optex.1 \
texlive-optex-doc"

RDEPENDS:${PN} += ""

inherit rpm
