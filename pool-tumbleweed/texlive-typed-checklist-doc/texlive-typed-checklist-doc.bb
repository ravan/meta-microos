SUMMARY = "Documentation for texlive-typed-checklist"
DESCRIPTION = "This package includes the documentation for texlive-typed-checklist"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77682"

RPM_NAME = "texlive-typed-checklist-doc-2026.226.2.1svn77682-59.2.noarch.rpm"
RPM_HASH = "ee882e6a92b529e5e5969fd9176a2794f33364edc05052cd135f79755de39c18b8afe6b300360635d5d343805f0b21cc511515820d0ec967fdf8d2b4a1b5f89f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typed-checklist-doc"

RDEPENDS:${PN} += ""

inherit rpm
