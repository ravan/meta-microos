SUMMARY = "Documentation for texlive-makeshape"
DESCRIPTION = "This package includes the documentation for texlive-makeshape"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn28973"

RPM_NAME = "texlive-makeshape-doc-2026.226.2.1svn28973-59.2.noarch.rpm"
RPM_HASH = "70812ac33b86571a38db8536eaa528b7ac21cd6fa51f59e01676c1bf7304b71c3147aede6e0ca801626f5dea3a7aa581e3134d0ace2ebe1533a15eb0d2e50759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeshape-doc"

RDEPENDS:${PN} += ""

inherit rpm
