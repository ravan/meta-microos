SUMMARY = "GAP: Decomposition of finite groups reprensentations into irreducibles"
DESCRIPTION = "The RepnDecomp package provides functions implementing various \
algorithms for decomposing linear representations of finite groups."
LICENSE = "GPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "gap-repndecomp-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "5f5d83f2959ef44802bb2c0edeff4b31b1343986bc280db64d9fb44fe9fa15efb63684402b2fc50cbd4f35ee7ee46fba1aebaeca6e045201689fef8df61ba2a8"

RPROVIDES:${PN} += "gap-repndecomp"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-grape"

inherit rpm
