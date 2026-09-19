SUMMARY = "GAP: A package for numerical semigroups"
DESCRIPTION = "The features of this package include \
 \
* Defining numerical semigroups; \
 \
* Computing several properties of numerical semigroups, namely: \
  multiplicity, Frobenius number, (minimal) system of generators, \
  Apéry set, gaps, fundamental gaps, etc.; \
 \
* Performing several operations on numerical semigroups, namely: \
  intersection, quotient by an integer, decompose into \
  irreducible semigroups, add a special gap;"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "gap-numericalsgps-1.5.0-1.1.noarch.rpm"
RPM_HASH = "91f03380604cd84a6242f2f6ae92ec7baf8304e98b118db4af8ca38d2bccdd9cfcc0b46b04c8b24ca5b5a172d767adc4753280fed020672bc9a76ec7878469b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-numericalsgps"

RDEPENDS:${PN} += "gap-core"

inherit rpm
