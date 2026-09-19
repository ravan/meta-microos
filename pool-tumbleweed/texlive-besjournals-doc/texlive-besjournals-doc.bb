SUMMARY = "Documentation for texlive-besjournals"
DESCRIPTION = "This package includes the documentation for texlive-besjournals"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-besjournals-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "03d2d6935e06be78e751468e7b8d802b629c685f5b014654b60dafc7639fe5704030691eb2d144c265bd1538eaae9cb06a1330d9f0ed753c791150af3ea0b505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals-doc"

RDEPENDS:${PN} += ""

inherit rpm
