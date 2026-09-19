SUMMARY = "Documentation for texlive-css-colors"
DESCRIPTION = "This package includes the documentation for texlive-css-colors"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn54512"

RPM_NAME = "texlive-css-colors-doc-2026.226.1.02svn54512-61.2.noarch.rpm"
RPM_HASH = "bcd4a2c4184ac035a6be6294fd4918b6bb6c7723baf845de9664b6ce27663ae866e9f4956c5095d7d41e38574971671dd0464134940182738151ba28bbe89519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-css-colors-doc"

RDEPENDS:${PN} += ""

inherit rpm
