SUMMARY = "Documentation for texlive-readarray"
DESCRIPTION = "This package includes the documentation for texlive-readarray"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn60540"

RPM_NAME = "texlive-readarray-doc-2026.226.3.1svn60540-60.4.noarch.rpm"
RPM_HASH = "9dca8ea342e882f798d1d4e07a64b7ef2f92cf01a5c47143e5ad057d16736eac8cc1496a76eed87f0761f4c9d96bc810324cf30dd7af6375e1afbf50a954a6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
