SUMMARY = "Documentation for texlive-ntheorem"
DESCRIPTION = "This package includes the documentation for texlive-ntheorem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.33svn77682"

RPM_NAME = "texlive-ntheorem-doc-2026.226.1.33svn77682-61.2.noarch.rpm"
RPM_HASH = "ffe9479d1f490b59e39a3c6613eceb13ff5dc0f1d0bdbe6ac2f94599981f1736f1b4cab0e1b17a5cd548ccbffb618d12656c8ad6a5c19443ffc76bbf113568c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ntheorem-doc-en \
texlive-ntheorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
