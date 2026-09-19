SUMMARY = "Documentation for texlive-commado"
DESCRIPTION = "This package includes the documentation for texlive-commado"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.11asvn38875"

RPM_NAME = "texlive-commado-doc-2026.226.r0.11asvn38875-60.2.noarch.rpm"
RPM_HASH = "2fb0e10a575a3c9244c99f0dd9adf5c8589d2ebf9fcb05df584f04c2f8952f03af85d0d6d8b784d74ff37479b8979b5833c2712919cc2220e8879c1a795b7572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commado-doc"

RDEPENDS:${PN} += ""

inherit rpm
