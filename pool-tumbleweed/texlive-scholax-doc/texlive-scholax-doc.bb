SUMMARY = "Documentation for texlive-scholax"
DESCRIPTION = "This package includes the documentation for texlive-scholax"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.033svn77682"

RPM_NAME = "texlive-scholax-doc-2026.226.1.033svn77682-60.2.noarch.rpm"
RPM_HASH = "3e3aeb81d32304777386b7dd222ff9a355053907b0364b9ed950fdd6faa69b949f1d570c372f3b6243e5f2ffaf6bcc84bbc82f36d265dba6c46ba328302df9ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scholax-doc"

RDEPENDS:${PN} += ""

inherit rpm
