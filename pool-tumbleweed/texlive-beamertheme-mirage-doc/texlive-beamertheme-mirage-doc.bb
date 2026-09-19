SUMMARY = "Documentation for texlive-beamertheme-mirage"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-mirage"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn73516"

RPM_NAME = "texlive-beamertheme-mirage-doc-2026.226.1.1.1svn73516-61.2.noarch.rpm"
RPM_HASH = "f4db34f8f833b74c3b2945a4ec403a0e5a91ac270a28e368fae7f809b43417ea175c087082e86c6a80f2fa1c75d6572241db3453421b068d5814f1501f535131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-beamertheme-mirage-doc-en \
texlive-beamertheme-mirage-doc \
zh)"

RDEPENDS:${PN} += ""

inherit rpm
