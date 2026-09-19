SUMMARY = "Documentation for texlive-useclass"
DESCRIPTION = "This package includes the documentation for texlive-useclass"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-useclass-doc-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "3cdc1883b487def38eb760f269cafb66d77370ecfa01fbda7f7d083219e738d9e799a4f3769abc75b4d74b3894d116fbaec22592e753b835b03434a074296bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-useclass-doc"

RDEPENDS:${PN} += ""

inherit rpm
