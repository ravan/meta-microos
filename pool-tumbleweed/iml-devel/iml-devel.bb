SUMMARY = "Development files for IML, an Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix. \
 \
This subpackage contains the include files and library links for \
developing against the IML library."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "iml-devel-1.0.5-5.22.aarch64.rpm"
RPM_HASH = "e200e7ebc8a43aa8f283c9d5d92b41ba1084d83a5487534bacb8d2791a6c2b7cc63e46f44f6d492cd9fa372ba15e25ef5038e73a84c9ab136f9f00f48f890d02"

RPROVIDES:${PN} += "iml-devel"

RDEPENDS:${PN} += "gmp-devel \
libiml0"

inherit rpm
