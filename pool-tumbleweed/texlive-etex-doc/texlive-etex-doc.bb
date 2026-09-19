SUMMARY = "Documentation for texlive-etex"
DESCRIPTION = "This package includes the documentation for texlive-etex"
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-etex-doc-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "90c958cfb98218dc3a0d2d36b07891e3a190f5bdbc283fe5236baec1942ec925846bb03cc850f3aa6b1f40f3e9c0bd69794351b935bbb5c2eb2158362ac49cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-etex.1 \
texlive-etex-doc"

RDEPENDS:${PN} += ""

inherit rpm
