SUMMARY = "Documentation for texlive-innerscript"
DESCRIPTION = "This package includes the documentation for texlive-innerscript"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4asvn75161"

RPM_NAME = "texlive-innerscript-doc-2026.226.1.4asvn75161-60.2.noarch.rpm"
RPM_HASH = "db4079d89a383af4a60a04c8c779745c9994b102ef2034490e0277d340ebd04a6fba008512f149744443c3633abd5f431ce00c106fad5279d108afabf7a30aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-innerscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
