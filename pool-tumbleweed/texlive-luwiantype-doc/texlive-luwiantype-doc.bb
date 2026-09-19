SUMMARY = "Documentation for texlive-luwiantype"
DESCRIPTION = "This package includes the documentation for texlive-luwiantype"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn73719"

RPM_NAME = "texlive-luwiantype-doc-2026.226.1.3svn73719-59.2.noarch.rpm"
RPM_HASH = "c57755caa85830a17ddfd7c652b8722b28caf73b983d8b2f4b5ff956671040314c7e8aac26111a8bfc987b7b181ff1b1bed9aedecdbcb24e97f34fd17da205a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luwiantype-doc"

RDEPENDS:${PN} += ""

inherit rpm
