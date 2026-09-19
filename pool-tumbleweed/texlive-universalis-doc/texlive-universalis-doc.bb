SUMMARY = "Documentation for texlive-universalis"
DESCRIPTION = "This package includes the documentation for texlive-universalis"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-universalis-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "d3ea2ed3ea64b6879d20a824f6b928a06ba0f6213c02b18bce88818ebfc7b1491c5620e14f6738376575449f9350723e1d7b90f6f58f4627f32b136376892e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-universalis-doc"

RDEPENDS:${PN} += ""

inherit rpm
