SUMMARY = "Documentation for texlive-srcltx"
DESCRIPTION = "This package includes the documentation for texlive-srcltx"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.6svn15878"

RPM_NAME = "texlive-srcltx-doc-2026.226.1.6svn15878-64.2.noarch.rpm"
RPM_HASH = "ff53d4bd53b035eb184fde98e2c51b123b18f15a462665a4b637971bfd5d807c29c9127312540029de57e6d6f263d379c3c85802eb1cf7c482dcd9da0335bc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srcltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
