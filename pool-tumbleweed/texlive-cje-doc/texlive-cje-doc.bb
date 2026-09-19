SUMMARY = "Documentation for texlive-cje"
DESCRIPTION = "This package includes the documentation for texlive-cje"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn68656"

RPM_NAME = "texlive-cje-doc-2026.226.1.07svn68656-60.2.noarch.rpm"
RPM_HASH = "aac584ecc55b309743e88a257c0d990d4dbfcf599a61687b5590a54a84d535c7916d2b58e337f2b6a3be90eaea17d119bb535d985ecec9d7162fef01753da872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cje-doc"

RDEPENDS:${PN} += ""

inherit rpm
