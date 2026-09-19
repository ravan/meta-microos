SUMMARY = "Documentation for texlive-calligra-type1"
DESCRIPTION = "This package includes the documentation for texlive-calligra-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.001.000svn24302"

RPM_NAME = "texlive-calligra-type1-doc-2026.226.001.000svn24302-59.2.noarch.rpm"
RPM_HASH = "3bc8e29e7653823a533c3acdf6e125637b2c8a4b97fa63fbb84c6b1fb24c2e316ce935e6f58430ddb7e4c81736e1adf35d2d33aa1f7e804caf01d204b7a832b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
