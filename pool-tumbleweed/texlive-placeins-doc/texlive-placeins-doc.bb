SUMMARY = "Documentation for texlive-placeins"
DESCRIPTION = "This package includes the documentation for texlive-placeins"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-placeins-doc-2026.226.2.2svn77682-58.2.noarch.rpm"
RPM_HASH = "caee2a02ee49f6d14746a0d6d38465452f82072788234966c16299b5dca2cd40f570e3db503870a2f6d35af901152b9026efcd0d8301739aaf963ffc03949298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeins-doc"

RDEPENDS:${PN} += ""

inherit rpm
