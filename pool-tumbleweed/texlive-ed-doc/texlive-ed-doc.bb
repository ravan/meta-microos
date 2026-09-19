SUMMARY = "Documentation for texlive-ed"
DESCRIPTION = "This package includes the documentation for texlive-ed"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn25231"

RPM_NAME = "texlive-ed-doc-2026.226.1.8svn25231-61.4.noarch.rpm"
RPM_HASH = "e724b767a41a57e5afb6853cc3273464e101fa548d020419cd8daa9213d9838a3c4cfda1a5bf866f0d9d14d9115985c2cbcf609a8b2e1a601cbc2a48e7fe1ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ed-doc"

RDEPENDS:${PN} += ""

inherit rpm
