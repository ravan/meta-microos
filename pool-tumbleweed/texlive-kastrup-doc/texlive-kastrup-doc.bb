SUMMARY = "Documentation for texlive-kastrup"
DESCRIPTION = "This package includes the documentation for texlive-kastrup"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-kastrup-doc-2026.226.svn15878-63.2.noarch.rpm"
RPM_HASH = "c368064de1d22cdb2e2cc68dc6e9e2fed9e95e446bb95ca86e932d134dc597afc7813d5dc4638ccd010555655df41b75d7267445f28e4bb8f48d37c532d48110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kastrup-doc"

RDEPENDS:${PN} += ""

inherit rpm
