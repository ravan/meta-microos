SUMMARY = "Documentation for texlive-bigints"
DESCRIPTION = "This package includes the documentation for texlive-bigints"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bigints-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "d890021cc70513188e80857138e52f3abd5626d8189498828cbf92838d52371895482a58da6553aca69846f36017122d64b315768be47e2ae5724003409f4608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigints-doc"

RDEPENDS:${PN} += ""

inherit rpm
