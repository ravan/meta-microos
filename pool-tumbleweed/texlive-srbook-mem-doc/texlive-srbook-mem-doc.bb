SUMMARY = "Documentation for texlive-srbook-mem"
DESCRIPTION = "This package includes the documentation for texlive-srbook-mem"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn45818"

RPM_NAME = "texlive-srbook-mem-doc-2026.226.svn45818-64.2.noarch.rpm"
RPM_HASH = "f77e9eed872d17d10b01acb09e1dcb23facf7478ddc5ce5eab759da0af4006b90a3674b2e8de53d8e37007060998c483447ae0b92af8078c07b568df3dd8dcbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbook-mem-doc"

RDEPENDS:${PN} += ""

inherit rpm
