SUMMARY = "Documentation for texlive-harvard"
DESCRIPTION = "This package includes the documentation for texlive-harvard"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.5svn77682"

RPM_NAME = "texlive-harvard-doc-2026.226.2.0.5svn77682-60.4.noarch.rpm"
RPM_HASH = "733a5f481f66dd0ca8d922426b7448a50a447e9a092a404a20d1a3739ba6c592d9dcfc70694083490d28680c22f48011effaed74fe7b4a81c54840cf755daba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvard-doc"

RDEPENDS:${PN} += ""

inherit rpm
