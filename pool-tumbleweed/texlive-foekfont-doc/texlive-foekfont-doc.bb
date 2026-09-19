SUMMARY = "Documentation for texlive-foekfont"
DESCRIPTION = "This package includes the documentation for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-foekfont-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "271faaa30f67dab2258b1717b867b1d1ba99b4ac980bd6c8aceb61ba0e0cfe006cb4aebba486851eb3fcadaf603fc442925cf3a292ed699a624d852e420e1386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foekfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
