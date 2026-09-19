SUMMARY = "Documentation for texlive-fewerfloatpages"
DESCRIPTION = "This package includes the documentation for texlive-fewerfloatpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77682"

RPM_NAME = "texlive-fewerfloatpages-doc-2026.226.1.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "5f185eb385d5869838817808a6a21360573d34199717fd4b6949af9ddf9b096997184c7d958d6d37454a7e9537c3bcc93664ea0ac30d3a58ba1b09bada792f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fewerfloatpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
