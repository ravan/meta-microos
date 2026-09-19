SUMMARY = "Suite of nonlinear solvers - combined examples"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package provides a collection of examples for all sundials solvers."
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-examples-doc-7.9.0-1.1.noarch.rpm"
RPM_HASH = "30d7896e3558c068725694267979d025c84ae85c4bcca252a770083f7e3433a019414aeb442105f3c5976c0ffa03ee71e27ffb7f8590c8c072949ad5744a405a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundials-examples-doc"

RDEPENDS:${PN} += ""

inherit rpm
