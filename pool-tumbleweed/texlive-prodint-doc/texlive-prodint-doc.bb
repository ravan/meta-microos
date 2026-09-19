SUMMARY = "Documentation for texlive-prodint"
DESCRIPTION = "This package includes the documentation for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2026.226.svn21893"

RPM_NAME = "texlive-prodint-doc-2026.226.svn21893-59.2.noarch.rpm"
RPM_HASH = "8149d1f9d3822511e0b35ed6da32a282e56ecbd9478682ba7f7aba90c05892b7ac17066186d3d0d4e977147a6bdbb6750c650a47cbee6336ebc4ed479ca07149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prodint-doc"

RDEPENDS:${PN} += ""

inherit rpm
