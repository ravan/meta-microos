SUMMARY = "Documentation for texlive-esami"
DESCRIPTION = "This package includes the documentation for texlive-esami"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn71883"

RPM_NAME = "texlive-esami-doc-2026.226.2.9svn71883-61.4.noarch.rpm"
RPM_HASH = "fc46d397c2270d293242657b22b4e2fc05b5cc1f34c10d9a7619abcb81ca8674a20729406ca7e6ee5f2a951ed0f0e0930352df2de0d1cf95709297159a53f056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-esami-doc-en;it \
texlive-esami-doc"

RDEPENDS:${PN} += ""

inherit rpm
