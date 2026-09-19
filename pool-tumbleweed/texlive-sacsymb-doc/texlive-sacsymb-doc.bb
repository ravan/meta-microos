SUMMARY = "Documentation for texlive-sacsymb"
DESCRIPTION = "This package includes the documentation for texlive-sacsymb"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn65768"

RPM_NAME = "texlive-sacsymb-doc-2026.226.svn65768-60.2.noarch.rpm"
RPM_HASH = "c3c5e50c9b66c0d09cab70ee955a23b98cd1188da1dbfd46f53d067094a123976f8bb73075c4a52760b175593e90058810bf8c8f3a5f6b3e42dae01dcfe9a341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sacsymb-doc"

RDEPENDS:${PN} += ""

inherit rpm
