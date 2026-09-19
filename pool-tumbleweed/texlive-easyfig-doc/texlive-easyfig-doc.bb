SUMMARY = "Documentation for texlive-easyfig"
DESCRIPTION = "This package includes the documentation for texlive-easyfig"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-easyfig-doc-2026.226.1.2asvn77682-61.4.noarch.rpm"
RPM_HASH = "5672ab0b3db3c75a288e3ad0339f352e99b8ed2e4b519db4813bef3e1b8229038fa84c2f3c0999733d9b9c19c60cad6894b55ab9952eb14e55ccb5aafa691f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
