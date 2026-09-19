SUMMARY = "Documentation for texlive-diagnose"
DESCRIPTION = "This package includes the documentation for texlive-diagnose"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-doc-2026.226.0.0.2svn19387-59.2.noarch.rpm"
RPM_HASH = "d9af0b304705285be574da84aa0f739823eed2c29392a447f0be7cbec41da152fac62e73423577f81f59699303dec882b811f4dccef13440b3c5045ef0fcf31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagnose-doc"

RDEPENDS:${PN} += ""

inherit rpm
