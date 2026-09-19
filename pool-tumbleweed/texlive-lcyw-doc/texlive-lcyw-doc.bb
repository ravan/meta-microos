SUMMARY = "Documentation for texlive-lcyw"
DESCRIPTION = "This package includes the documentation for texlive-lcyw"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-lcyw-doc-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "78e5a4fbfed7dc2480275a01193be99a75f43b612b4eb6b284da818d40d20b601698408c6365cbb38702249be7f6fed9d32196f4f8cb9a26709c20c2fe92940f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcyw-doc"

RDEPENDS:${PN} += ""

inherit rpm
