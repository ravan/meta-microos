SUMMARY = "Documentation for texlive-dichokey"
DESCRIPTION = "This package includes the documentation for texlive-dichokey"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17192"

RPM_NAME = "texlive-dichokey-doc-2026.226.svn17192-59.2.noarch.rpm"
RPM_HASH = "1ab4241711b97e437cd7576ad0b9329172634a3fd62540da83f1103a407642aeb3006b433126580f4b2c4aab2bcdc3c5f4e020c737c325ad557b38f38cb2dea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
