SUMMARY = "Documentation for texlive-pst-pulley"
DESCRIPTION = "This package includes the documentation for texlive-pst-pulley"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-doc-2026.226.0.0.02svn62977-60.4.noarch.rpm"
RPM_HASH = "50937bfd421f1102e6c78d24299a9375239ca545bfef23e4828a409fc86fe24bcbf95fa706607837ccf9a5235c9a71eafe2bce8e6e9de1f415dd61abc020e026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pulley-doc"

RDEPENDS:${PN} += ""

inherit rpm
