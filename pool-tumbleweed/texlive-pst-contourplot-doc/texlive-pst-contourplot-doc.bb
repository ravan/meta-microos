SUMMARY = "Documentation for texlive-pst-contourplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-contourplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-doc-2026.226.0.0.6svn48230-59.2.noarch.rpm"
RPM_HASH = "9881bf99f341e629c9a11fb48d14a952ed17cfd3c8f119bc30fdeb0ba90befb2e8a5f6a335af2c010f2b280b65661318d1ab5ea542aa65da6ce5177cf2b961bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-contourplot-doc-fr \
texlive-pst-contourplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
