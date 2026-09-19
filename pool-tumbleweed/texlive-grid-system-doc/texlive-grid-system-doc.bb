SUMMARY = "Documentation for texlive-grid-system"
DESCRIPTION = "This package includes the documentation for texlive-grid-system"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-doc-2026.226.0.0.3.0svn32981-60.4.noarch.rpm"
RPM_HASH = "684808aba2079bc63f056d32a63479690682f16fa8bfbbe8e99ead90ced55328d79d899015041ac6536a1415097146cd94e27112205e433221426d996371cf38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-system-doc"

RDEPENDS:${PN} += ""

inherit rpm
