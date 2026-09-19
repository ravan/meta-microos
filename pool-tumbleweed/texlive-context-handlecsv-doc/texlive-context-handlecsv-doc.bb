SUMMARY = "Documentation for texlive-context-handlecsv"
DESCRIPTION = "This package includes the documentation for texlive-context-handlecsv"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76721"

RPM_NAME = "texlive-context-handlecsv-doc-2026.226.svn76721-61.2.noarch.rpm"
RPM_HASH = "5cff026059379729a9983164aa2f04304cfb8ce90c675c4168389ee931208080f6910fb102b87e78f3590de7e184f7de4bf179827e53c03d6b672e8bdd5f11db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-handlecsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
