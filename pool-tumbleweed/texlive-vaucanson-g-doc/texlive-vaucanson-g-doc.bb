SUMMARY = "Documentation for texlive-vaucanson-g"
DESCRIPTION = "This package includes the documentation for texlive-vaucanson-g"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn15878"

RPM_NAME = "texlive-vaucanson-g-doc-2026.226.0.0.4svn15878-60.2.noarch.rpm"
RPM_HASH = "1427a0408be16759795f376d2a1f4f70126056ba20db16efe2fa7789d3ebac7a3fcf4acb355d9d4cae3c429f378d8f16fd2e2e0230dbf6aa80c658f28f5f2c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vaucanson-g-doc"

RDEPENDS:${PN} += ""

inherit rpm
