SUMMARY = "Documentation for texlive-xkeyval"
DESCRIPTION = "This package includes the documentation for texlive-xkeyval"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.10svn77682"

RPM_NAME = "texlive-xkeyval-doc-2026.226.2.10svn77682-59.4.noarch.rpm"
RPM_HASH = "d6315b861ed71abe03cf48af1a471e8c57bf60086ab02a66fcc1b80f17bf46db2bd939e5f186485abff1c3e197e21de4f75983288ccb37d64d21587edbf1edc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
