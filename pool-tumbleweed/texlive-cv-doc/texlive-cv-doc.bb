SUMMARY = "Documentation for texlive-cv"
DESCRIPTION = "This package includes the documentation for texlive-cv"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cv-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "827fb5ab742744c31e02125ee4364b0aebf3e15002d7a0c05608bf03bebea5bd0fe945f765bbc2b223536c186cba402c5569072cd61c5849f4cacfda8fbb3495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
