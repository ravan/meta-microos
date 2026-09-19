SUMMARY = "Documentation for texlive-xetex-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-xetex-pstricks"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17055"

RPM_NAME = "texlive-xetex-pstricks-doc-2026.226.svn17055-59.4.noarch.rpm"
RPM_HASH = "291a7f4c8ec4739ee8cd899fbda91c5473ced0c1245b93f6fc79e4fda86a8fdfe347ec545f4c092cf7c143e2478ce86bce83385d614e07316fd8029558c8a4bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
