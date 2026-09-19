SUMMARY = "Documentation for texlive-miller"
DESCRIPTION = "This package includes the documentation for texlive-miller"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn18789"

RPM_NAME = "texlive-miller-doc-2026.226.1.2svn18789-61.2.noarch.rpm"
RPM_HASH = "52649b6c47856963efcd8d13282b4a4c67a86a3ac7bfd1bb9b0a7155f09c19fc717789584a82ba44cdbb6851721cfa0a3cdd6b4f48737590db050b403b301810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miller-doc"

RDEPENDS:${PN} += ""

inherit rpm
