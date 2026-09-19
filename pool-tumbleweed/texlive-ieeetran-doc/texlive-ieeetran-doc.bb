SUMMARY = "Documentation for texlive-ieeetran"
DESCRIPTION = "This package includes the documentation for texlive-ieeetran"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-doc-2026.226.1.8bsvn59672-60.2.noarch.rpm"
RPM_HASH = "1687b1b2c4b539b0f581f17e20ce0e59f97ef075d1507b4460700b52bca8ab5f083f486ea9d366eba5371ceb7622442251bb46602ef08e5e1ea710e9537aa20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
