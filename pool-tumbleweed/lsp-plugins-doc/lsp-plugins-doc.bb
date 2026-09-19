SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.34"

RPM_NAME = "lsp-plugins-doc-1.2.34-1.1.noarch.rpm"
RPM_HASH = "1ab3000187d3834d7703e468e37a6aaf52d3147a0794a500b55b41a3a7f05d433f35b06074302ded26d90f34a0f3f8fa6b14eb63489bc9a614783fedacbb3419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"

RDEPENDS:${PN} += ""

inherit rpm
