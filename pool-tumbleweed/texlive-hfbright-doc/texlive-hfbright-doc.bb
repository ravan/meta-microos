SUMMARY = "Documentation for texlive-hfbright"
DESCRIPTION = "This package includes the documentation for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-hfbright-doc-2026.226.svn29349-60.4.noarch.rpm"
RPM_HASH = "24cfce47a82ba0e3e5d11f44b3fcb82863268d75396d921b1c959a334ddcfc2c3130fc079cc850c8e539473497f27f53339218b4f882cfecaf9ac2c51a1a9ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
