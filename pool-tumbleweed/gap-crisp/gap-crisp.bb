SUMMARY = "GAP: Computing with Radicals, Injectors, Schunck classes and Projectors"
DESCRIPTION = "The GAP package 'CRISP' provides algorithsmf roc omputing subgroups \
of finite solvable groups related to a group class 'C'. In \
particular, it allows to compute 'C' radicals and 'C'-injectors for \
Fitting (and Fitting sets) 'C', 'C'-residuals for formations 'C', and \
'C'-projectors for Schunck classes 'C'. \
 \
Moreover, CRISP contains algorithms for the computation of normal \
subgroups invariant under a prescribed set of automorphisms and \
belonging to a given group class."
LICENSE = "BSD-2-Clause"

PV = "1.4.11"

RPM_NAME = "gap-crisp-1.4.11-1.1.noarch.rpm"
RPM_HASH = "c9bed7a008e2e38acdb5d9b2ac9c10b7ddaa189d00302171bb8c910ea0bdd031b29cab81afbb1c832c21e4f67c874c77b8bc32eeec5dc9bba2f8b6e9e511ddb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-crisp"

RDEPENDS:${PN} += "/usr/bin/bash \
gap-core"

inherit rpm
