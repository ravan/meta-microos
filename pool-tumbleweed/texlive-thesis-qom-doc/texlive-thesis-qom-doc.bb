SUMMARY = "Documentation for texlive-thesis-qom"
DESCRIPTION = "This package includes the documentation for texlive-thesis-qom"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-doc-2026.227.0.0.5svn63524-62.2.noarch.rpm"
RPM_HASH = "b4a4a1f09ae3977d091d576dbd1bb1aa328c4998c4cd477e8ff1834596653425fb5e6572dddeee288eb64dfc5dc779e50c4d73d0a941390c02ca24635a712f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thesis-qom-doc-fa-ir \
texlive-thesis-qom-doc"

RDEPENDS:${PN} += ""

inherit rpm
