SUMMARY = "Documentation for texlive-eoldef"
DESCRIPTION = "This package includes the documentation for texlive-eoldef"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76050"

RPM_NAME = "texlive-eoldef-doc-2026.226.1.1svn76050-61.4.noarch.rpm"
RPM_HASH = "8e8c9c5a14c842f6d9ee81be5c472fee202937cc6c145e80df342fdea059d774c0751b01be72fd70ddc495b835dd6059002d46f8095d1c03938b81ee96b3270c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eoldef-doc"

RDEPENDS:${PN} += ""

inherit rpm
