SUMMARY = "Documentation for texlive-nrc"
DESCRIPTION = "This package includes the documentation for texlive-nrc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01asvn29027"

RPM_NAME = "texlive-nrc-doc-2026.226.2.01asvn29027-61.2.noarch.rpm"
RPM_HASH = "1ece4926427b7107b440a5ebf95c1798077849f2338a057b249e8c84b32f0b200dc61ed1519212e3dcf3c6c1f0dd9b552583268161a25170e91e7ee93e6c5622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
