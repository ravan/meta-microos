SUMMARY = "Documentation for texlive-t-angles"
DESCRIPTION = "This package includes the documentation for texlive-t-angles"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn71991"

RPM_NAME = "texlive-t-angles-doc-2026.226.svn71991-64.2.noarch.rpm"
RPM_HASH = "882f0561a6bb009953c64437913722ab5af9d966e83b6db4a53db2a688d3de484f5af2a36b9484a9f5de2dad7f90a9b710d3c833d582a1a17282f35bfe09952f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t-angles-doc"

RDEPENDS:${PN} += ""

inherit rpm
