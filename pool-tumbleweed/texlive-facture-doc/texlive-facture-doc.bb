SUMMARY = "Documentation for texlive-facture"
DESCRIPTION = "This package includes the documentation for texlive-facture"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn67538"

RPM_NAME = "texlive-facture-doc-2026.226.1.3svn67538-59.2.noarch.rpm"
RPM_HASH = "5ca98ce7f9e57870b4c1d12685ce89775d66ff784e2f68420b3e0daf6c302ec812a92f03fceda8bb0b2ef67aacf95a502d70e518407b07b70fa8f9d8857002ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-facture-doc-fr \
texlive-facture-doc"

RDEPENDS:${PN} += ""

inherit rpm
