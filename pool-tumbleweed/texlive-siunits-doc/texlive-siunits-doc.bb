SUMMARY = "Documentation for texlive-siunits"
DESCRIPTION = "This package includes the documentation for texlive-siunits"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn59702"

RPM_NAME = "texlive-siunits-doc-2026.226.1.36svn59702-64.2.noarch.rpm"
RPM_HASH = "95f2a6efa8f2d3b715516da5cd12d1ee20f05100393a152f895d12618129e56d03c6cab8924f74201993c8cada9ac94b7565216f76f218d5b0d04389d2742944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
