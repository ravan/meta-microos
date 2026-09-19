SUMMARY = "Documentation for texlive-mla-paper"
DESCRIPTION = "This package includes the documentation for texlive-mla-paper"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-mla-paper-doc-2026.226.svn54080-61.2.noarch.rpm"
RPM_HASH = "c5dcb1fc58794679f25d2439ef7bdb3b0f7ba725fdc873c39d8499c4bdc1a22e57708edb40d453810641ddbf7a650219025d7a38e8a39ddcf743bf4423d61768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mla-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
