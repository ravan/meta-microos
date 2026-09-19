SUMMARY = "Documentation for texlive-substr"
DESCRIPTION = "This package includes the documentation for texlive-substr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-substr-doc-2026.226.1.2svn77682-64.2.noarch.rpm"
RPM_HASH = "80d03157ecb076fe51f78eb028c875dfbb789eb5209bef6c9ec7db40d873330ddb694a1d526943547e39c91d7a29348c9daa02e808398c7a7e3aa135dba4d599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substr-doc"

RDEPENDS:${PN} += ""

inherit rpm
