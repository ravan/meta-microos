SUMMARY = "Documentation for texlive-cmpica"
DESCRIPTION = "This package includes the documentation for texlive-cmpica"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cmpica-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "8cba0644698cce675d6d0380e988f0378aa896350b11521a21edae798f0b4441e9903060bc69c1b97747e3ca0aeee8097afa3200b5bac3776a6dafce3450fe96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmpica-doc"

RDEPENDS:${PN} += ""

inherit rpm
