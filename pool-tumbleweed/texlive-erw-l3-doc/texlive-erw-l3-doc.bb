SUMMARY = "Documentation for texlive-erw-l3"
DESCRIPTION = "This package includes the documentation for texlive-erw-l3"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn78101"

RPM_NAME = "texlive-erw-l3-doc-2026.226.4.2svn78101-61.4.noarch.rpm"
RPM_HASH = "dbe88fa24a09f0bab9480f87abeef944d879600d6dbe90295ba23c05d508dc906407187052f12100ace6be3f3bf0e38822e76fec5df9525048987130d3d8fdc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erw-l3-doc"

RDEPENDS:${PN} += ""

inherit rpm
