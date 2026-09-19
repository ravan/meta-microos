SUMMARY = "Documentation for texlive-colorspace"
DESCRIPTION = "This package includes the documentation for texlive-colorspace"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn50585"

RPM_NAME = "texlive-colorspace-doc-2026.226.1.3svn50585-60.2.noarch.rpm"
RPM_HASH = "39e04bf6db4acece35830d59a4f32c752a420c37dff56fb89785f2f7fe5d691ed7ed26cb21a27e65ac098a8683efeb025023b76d0d9047bf77eb38bb692f2424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
