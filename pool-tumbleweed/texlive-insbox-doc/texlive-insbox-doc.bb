SUMMARY = "Documentation for texlive-insbox"
DESCRIPTION = "This package includes the documentation for texlive-insbox"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn34299"

RPM_NAME = "texlive-insbox-doc-2026.226.2.2svn34299-60.2.noarch.rpm"
RPM_HASH = "d5c6b1c4eb3b573730bb4452da239200b553acb292e6a51900e623a29d8138a3e7860613c4581c66840aacd3848d992dfd37f9902c38da2a3cbc5ac46419c323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-insbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
