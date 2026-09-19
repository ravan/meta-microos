SUMMARY = "Documentation for texlive-clefval"
DESCRIPTION = "This package includes the documentation for texlive-clefval"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55985"

RPM_NAME = "texlive-clefval-doc-2026.226.0.0.1svn55985-60.2.noarch.rpm"
RPM_HASH = "2c6c0271280b4d6c8bfb65667de07f96e7e61c90b539ffa3684324fd396c5895e5342cad5d01d747691bc9984f23639df165edeba14c2003ac29fb7b0ae4821c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-clefval-doc-fr \
texlive-clefval-doc"

RDEPENDS:${PN} += ""

inherit rpm
