SUMMARY = "Documentation for texlive-mdputu"
DESCRIPTION = "This package includes the documentation for texlive-mdputu"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn20298"

RPM_NAME = "texlive-mdputu-doc-2026.226.1.2svn20298-59.2.noarch.rpm"
RPM_HASH = "6cdc3ce5b878275b37c5d0aa7a3e4a1d2ccb8b7776c12a74b30267e5f1207ce6a1cb875c9b3e3e9801a0132d6b4c0828352a56e1861ce71e7aff862ebe55e3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdputu-doc"

RDEPENDS:${PN} += ""

inherit rpm
