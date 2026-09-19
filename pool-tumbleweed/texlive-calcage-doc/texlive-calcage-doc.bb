SUMMARY = "Documentation for texlive-calcage"
DESCRIPTION = "This package includes the documentation for texlive-calcage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.90svn27725"

RPM_NAME = "texlive-calcage-doc-2026.226.0.0.90svn27725-59.2.noarch.rpm"
RPM_HASH = "992870416539bb18ebd8370a846ac168c375a670f3ac5e6f2aa72acf966de74452665d01133232e0b765f89b11428b2d1f680531cc9fb70844ed13669429f82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calcage-doc"

RDEPENDS:${PN} += ""

inherit rpm
