SUMMARY = "Documentation for texlive-kotex-utf"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utf"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn63690"

RPM_NAME = "texlive-kotex-utf-doc-2026.226.3.0.0svn63690-63.2.noarch.rpm"
RPM_HASH = "c0c565e1ad1beb28bb77d71941bd32bfd28dee10fac3f94143463716ce4d8abf04fe991bf3211d64ebff02836fb4304fe17c83e553ba79ba766e52d96bd139fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kotex-utf-doc-ko \
texlive-kotex-utf-doc"

RDEPENDS:${PN} += ""

inherit rpm
