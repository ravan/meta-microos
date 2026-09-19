SUMMARY = "Documentation for texlive-bxjatoucs"
DESCRIPTION = "This package includes the documentation for texlive-bxjatoucs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn71870"

RPM_NAME = "texlive-bxjatoucs-doc-2026.226.0.0.3asvn71870-59.2.noarch.rpm"
RPM_HASH = "c6990c907f0193e1eaf79a9f50c77916f06e8c28c78effc647fdf47521a976507d71f93c038dc7d2d25e22cecf39a194164588d1cd9daa4d43fee2b137869c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjatoucs-doc"

RDEPENDS:${PN} += ""

inherit rpm
