SUMMARY = "Documentation for texlive-scrlayer-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-scrlayer-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn73851"

RPM_NAME = "texlive-scrlayer-fancyhdr-doc-2026.226.0.0.4svn73851-60.2.noarch.rpm"
RPM_HASH = "0a668752f1deb56fee5e00ba0b0f35f35b51b459c9b9599b519b35272ef00acb56cc567c9c7f8eed9de51d783217046f076a941dea5004ecd3bb1ff72420ba49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "de) \
locale(texlive-scrlayer-fancyhdr-doc-en \
texlive-scrlayer-fancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
