SUMMARY = "Documentation for texlive-emo"
DESCRIPTION = "This package includes the documentation for texlive-emo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-emo-doc-2026.226.0.0.4svn77682-61.4.noarch.rpm"
RPM_HASH = "712d4d0e5aa6980d9fd5dee9dbeb7d6b128c455a6eddc85f886bbea2a69f2ac6a8b478804987525e1b330034427bf833e1d5e17fa8431d3fff14903374269a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emo-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
