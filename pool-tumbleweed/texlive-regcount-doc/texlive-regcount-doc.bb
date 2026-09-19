SUMMARY = "Documentation for texlive-regcount"
DESCRIPTION = "This package includes the documentation for texlive-regcount"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn19979"

RPM_NAME = "texlive-regcount-doc-2026.226.1.0svn19979-60.4.noarch.rpm"
RPM_HASH = "09516d6c45c3c6f4210b8ad98b18638fa3911ea566561ebb769a03de7e850eb15a6d88b2e70023c845461cf7c645f19b8b8a1dfd6b0cd95acd805b86a2122ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
