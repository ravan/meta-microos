SUMMARY = "Documentation for texlive-marcellus"
DESCRIPTION = "This package includes the documentation for texlive-marcellus"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-marcellus-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "5b2078344048308eb3304c442bab463d97103328cf684c6a19e5bcc35ce05d88a4cf85df41018efad3a36897cccb226a7e874247d59e05529508d0e24cd1aa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marcellus-doc"

RDEPENDS:${PN} += ""

inherit rpm
