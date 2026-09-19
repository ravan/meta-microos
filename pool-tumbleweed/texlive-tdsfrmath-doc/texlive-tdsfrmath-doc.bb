SUMMARY = "Documentation for texlive-tdsfrmath"
DESCRIPTION = "This package includes the documentation for texlive-tdsfrmath"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-doc-2026.227.1.3svn15878-62.2.noarch.rpm"
RPM_HASH = "db400dfb875e546fcf07a163d1cf1794b52063ba2446cf2a4c8d49de2cfc108922753f7c4c6abe1fe93f0a395159f1cf5f299a144ae80fd6e8a98fc43177cb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tdsfrmath-doc-fr;en \
texlive-tdsfrmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
