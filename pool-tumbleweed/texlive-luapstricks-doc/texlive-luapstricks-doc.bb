SUMMARY = "Documentation for texlive-luapstricks"
DESCRIPTION = "This package includes the documentation for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn77336"

RPM_NAME = "texlive-luapstricks-doc-2026.226.0.0.11svn77336-59.2.noarch.rpm"
RPM_HASH = "8ddb8f9b73a0e212d1b4845000d6ef543a6b3a93acf911c594064d28068fe4de2b797389c43610d18b282265da927b5eaa41ead7616baf867ebb35f7f51d4161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luapstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
