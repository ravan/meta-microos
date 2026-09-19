SUMMARY = "Documentation for the cddlib API"
DESCRIPTION = "cddlib is an implementation of the Double Description Method of \
Motzkin et al. \
 \
This package contains the documentation to cddlib."
LICENSE = "GPL-2.0-or-later"

PV = "0.94n"

RPM_NAME = "cddlib-doc-0.94n-1.5.noarch.rpm"
RPM_HASH = "7b322575a5ce908125c36c6da46c978e98bbb69c3eb659533c1c73d287cbe2a459661c68737c482d35274fe6efce0717cb0e638ea4024a70236c062eeedd9801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cddlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
