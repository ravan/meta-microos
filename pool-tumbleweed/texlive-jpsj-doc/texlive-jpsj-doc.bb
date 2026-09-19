SUMMARY = "Documentation for texlive-jpsj"
DESCRIPTION = "This package includes the documentation for texlive-jpsj"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-doc-2026.226.1.2.2svn66115-63.2.noarch.rpm"
RPM_HASH = "51ad13a93dca66f9674d10899801c63647465c50f3821ce8fa018095b6885c06c467b3a8b4ba996a543950764bac913238efdcdce70ec0d8f8c4bddc92bb0319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jpsj-doc"

RDEPENDS:${PN} += ""

inherit rpm
