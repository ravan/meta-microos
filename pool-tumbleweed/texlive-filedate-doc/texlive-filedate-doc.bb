SUMMARY = "Documentation for texlive-filedate"
DESCRIPTION = "This package includes the documentation for texlive-filedate"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29529"

RPM_NAME = "texlive-filedate-doc-2026.226.svn29529-59.2.noarch.rpm"
RPM_HASH = "5e9ccc4f2c4cfa1cc74ea08cefd095d7f42b0d5a59ab38c7ca9d225bed86418b8da82cc4015f7cce11fe2bc85a8811c95b31fd360c809fb39dae858b975b4518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filedate-doc"

RDEPENDS:${PN} += ""

inherit rpm
