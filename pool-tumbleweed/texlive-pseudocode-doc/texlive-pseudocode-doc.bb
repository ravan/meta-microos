SUMMARY = "Documentation for texlive-pseudocode"
DESCRIPTION = "This package includes the documentation for texlive-pseudocode"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54080"

RPM_NAME = "texlive-pseudocode-doc-2026.226.svn54080-59.2.noarch.rpm"
RPM_HASH = "d1866358c5959bb9f125abf826adf1b91af8aca958726d5ada95be5b37346465341f8e3348f54fdaf7ac6cb1fe91d377afd75bab47e5e197e607f801d1867879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
