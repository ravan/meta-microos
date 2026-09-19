SUMMARY = "Documentation for texlive-tramlines"
DESCRIPTION = "This package includes the documentation for texlive-tramlines"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn71842"

RPM_NAME = "texlive-tramlines-doc-2026.226.1.1.1svn71842-59.2.noarch.rpm"
RPM_HASH = "8c4211aa64cea55946419795223e1624644ff20794f03751fe065097d7d5ced5a1f376c8262251e6050dbcf6c60931f0ddcded0e682425c3a205fb40d5fb8e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tramlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
