SUMMARY = "Documentation for texlive-context-pocketdiary"
DESCRIPTION = "This package includes the documentation for texlive-context-pocketdiary"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn73164"

RPM_NAME = "texlive-context-pocketdiary-doc-2026.226.svn73164-61.2.noarch.rpm"
RPM_HASH = "156eb9abeb74f52cb1f7e7932b2113cfa0ee9de6f5096a5eb69153320221f61770e71fbbafeb3a765444b9576121aa89b7f3cc36d0459bf818d1c8c1fe89a10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-pocketdiary-doc"

RDEPENDS:${PN} += ""

inherit rpm
