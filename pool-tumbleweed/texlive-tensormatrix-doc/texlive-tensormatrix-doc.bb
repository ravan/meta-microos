SUMMARY = "Documentation for texlive-tensormatrix"
DESCRIPTION = "This package includes the documentation for texlive-tensormatrix"
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.0.0svn76005"

RPM_NAME = "texlive-tensormatrix-doc-2026.227.1.0.0svn76005-62.2.noarch.rpm"
RPM_HASH = "69075ceada9b7b825a87c257bdd0770b5036d66984dc6c370fba31409e482192976318b01e30975bd967329f750be38855a7a5369c690ec9c67181db16c2adcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensormatrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
