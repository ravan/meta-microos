SUMMARY = "Documentation for texlive-fontbook"
DESCRIPTION = "This package includes the documentation for texlive-fontbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn23608"

RPM_NAME = "texlive-fontbook-doc-2026.226.0.0.2svn23608-60.2.noarch.rpm"
RPM_HASH = "98c32fa408fd708e0e98051f7e5f3481ff1a72fc9a872e16e3a6cc19f38b65c136fb580a6d504e7543705450d47c069f2bb89163d671de9d86ee40a3fb1d4db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
