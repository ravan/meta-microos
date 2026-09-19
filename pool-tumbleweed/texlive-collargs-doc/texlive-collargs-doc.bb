SUMMARY = "Documentation for texlive-collargs"
DESCRIPTION = "This package includes the documentation for texlive-collargs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn70689"

RPM_NAME = "texlive-collargs-doc-2026.226.1.2.0svn70689-60.2.noarch.rpm"
RPM_HASH = "dc45c10e362c0b0bfe124bb6a0d3b032dc3ccecc38aacee89ffe56a66dd00761cb8a7481c7932f0b257a2247769c080481a3d6243da5419ad626c6f25b248150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
