SUMMARY = "Documentation for texlive-mailing"
DESCRIPTION = "This package includes the documentation for texlive-mailing"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0dsvn77241"

RPM_NAME = "texlive-mailing-doc-2026.226.1.0dsvn77241-59.2.noarch.rpm"
RPM_HASH = "92d0ddd37b0ac4114fd99da780c13aa44d83dddc5353ededb4bf1e92242017d996cdb741972c39efa68715dac19ba9741a198d82c95d8793fb32285c94ec44cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailing-doc"

RDEPENDS:${PN} += ""

inherit rpm
