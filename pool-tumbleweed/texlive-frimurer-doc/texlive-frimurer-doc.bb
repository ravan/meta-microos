SUMMARY = "Documentation for texlive-frimurer"
DESCRIPTION = "This package includes the documentation for texlive-frimurer"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1svn56704"

RPM_NAME = "texlive-frimurer-doc-2026.226.1svn56704-60.2.noarch.rpm"
RPM_HASH = "30bba6f9415290cba4f6b146a93ac70e3246cc988d1eb8f4178ba98434a39bf0bfcb33bded595ee82b5c0b3c2988f8f4e10f76d666373cd35152bd2dd5144b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frimurer-doc"

RDEPENDS:${PN} += ""

inherit rpm
