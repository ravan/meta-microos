SUMMARY = "Documentation for texlive-hvlogos"
DESCRIPTION = "This package includes the documentation for texlive-hvlogos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.16svn77682"

RPM_NAME = "texlive-hvlogos-doc-2026.226.0.0.16svn77682-60.2.noarch.rpm"
RPM_HASH = "71392318c48838ed6cefa9dfe5116258c80e3afc17a3215e121fb7a9b31923140499bf37bcd21b597292172ffc25f9a1fc08abfe77a6044330b97fa470051c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvlogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
