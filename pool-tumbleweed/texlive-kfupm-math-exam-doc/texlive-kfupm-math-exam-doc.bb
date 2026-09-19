SUMMARY = "Documentation for texlive-kfupm-math-exam"
DESCRIPTION = "This package includes the documentation for texlive-kfupm-math-exam"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn63977"

RPM_NAME = "texlive-kfupm-math-exam-doc-2026.226.0.0.1.0svn63977-63.2.noarch.rpm"
RPM_HASH = "92bf32272df9e1970344be13686402ebbd5b59f2a782502354a665348c9916a08859a19a0678d3a641c7f8afa8ed86508bc880b55f851a03c1ebc1f8b9d66dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kfupm-math-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
