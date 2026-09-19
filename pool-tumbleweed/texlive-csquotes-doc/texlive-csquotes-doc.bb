SUMMARY = "Documentation for texlive-csquotes"
DESCRIPTION = "This package includes the documentation for texlive-csquotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2osvn77682"

RPM_NAME = "texlive-csquotes-doc-2026.226.5.2osvn77682-61.2.noarch.rpm"
RPM_HASH = "dc938a187fc129403d004453f5d656beba12c85f77aa9075638e13dac0d33faab63ef388f953158cec6306c51d91483191785c832703643140a0b97ba58eba9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
