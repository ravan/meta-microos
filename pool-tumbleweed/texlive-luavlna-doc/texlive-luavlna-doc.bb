SUMMARY = "Documentation for texlive-luavlna"
DESCRIPTION = "This package includes the documentation for texlive-luavlna"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1nsvn77682"

RPM_NAME = "texlive-luavlna-doc-2026.226.0.0.1nsvn77682-59.2.noarch.rpm"
RPM_HASH = "b8bec654eb402531f88951bb45e67f1def72e8f33068b675e509d94af16a0b70c5bcc5bb8273500f88cef44e2c2208087d4df31a40a4dafc848b2599823591c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luavlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
