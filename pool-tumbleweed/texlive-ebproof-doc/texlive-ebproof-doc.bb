SUMMARY = "Documentation for texlive-ebproof"
DESCRIPTION = "This package includes the documentation for texlive-ebproof"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.1svn77682"

RPM_NAME = "texlive-ebproof-doc-2026.226.2.1.1svn77682-61.4.noarch.rpm"
RPM_HASH = "1959a7369572301174af128e348cfc2c7eb0f337e7ea4bdaba3b42baf290266d32b63bf18907eed422c54a6587f94469d95164d1b6560e894534e780a8a6fcc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
