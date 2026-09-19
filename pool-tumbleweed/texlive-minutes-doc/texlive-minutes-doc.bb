SUMMARY = "Documentation for texlive-minutes"
DESCRIPTION = "This package includes the documentation for texlive-minutes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8fsvn42186"

RPM_NAME = "texlive-minutes-doc-2026.226.1.8fsvn42186-61.2.noarch.rpm"
RPM_HASH = "3a97d5bb45d2f090596bedc069d9210cfb4791c5af3fa4808b34302cf36256beea547b916bc74b1eb7c9c6d8e22aa1961dc5c4b4bc3452065558b943d0ba796e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minutes-doc"

RDEPENDS:${PN} += ""

inherit rpm
