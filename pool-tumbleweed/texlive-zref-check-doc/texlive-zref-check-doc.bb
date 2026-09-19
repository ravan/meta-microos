SUMMARY = "Documentation for texlive-zref-check"
DESCRIPTION = "This package includes the documentation for texlive-zref-check"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.7svn78101"

RPM_NAME = "texlive-zref-check-doc-2026.226.0.0.3.7svn78101-59.4.noarch.rpm"
RPM_HASH = "c83dc21c5ecbc2720cf4942380c74e7c567eab048826a08dab6d6dabf3cd952096e0be175eed4c37cacfe6368af4c401bbd2972e1e5ba0e77b11550adfcd8d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-check-doc"

RDEPENDS:${PN} += ""

inherit rpm
