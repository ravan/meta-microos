SUMMARY = "Documentation for texlive-mensa-tex"
DESCRIPTION = "This package includes the documentation for texlive-mensa-tex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45997"

RPM_NAME = "texlive-mensa-tex-doc-2026.226.svn45997-59.2.noarch.rpm"
RPM_HASH = "9df2fe57fe814803a6d1235ca09cb9b54f5ceb11768061137c705fc99ec5cd03cc62aa0a8922c7d2d6b406e7094bcc3db3cb2459243737e31463c661bec49835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mensa-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
