SUMMARY = "Suite of nonlinear solvers (documentation)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the documentation files"
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-doc-7.9.0-1.1.noarch.rpm"
RPM_HASH = "405803b0fc5031ec80e2a2c5706c2c058dcfb379d7900e655221a63ec99a922e53a6303f1937969524da985c66ecd955ec9c59ffc51b1f436429f7a03ab31e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundials-doc"

RDEPENDS:${PN} += ""

inherit rpm
