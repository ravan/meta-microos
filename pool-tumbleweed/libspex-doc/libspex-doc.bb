SUMMARY = "SPEX, A SParse EXact Algebra Factorizations"
DESCRIPTION = "Documentation for libspex. \
 \
SPEX is software package used to solve a sparse systems of linear equations \
and replaces SLIP LU. \
 \
SPEX Util is a software package containing utility and auxiliary functions for the \
SPEX factorizations. Additionally, SPEX Util provides a wrapper class for the GNU \
Multiple Precision Arithmetic (GMP) and GNU Multiple Precision Floating Point \
Reliable (MPFR) libraries that prevent memory leaks and improve the overall \
stability of these external libraries. SPEX Util is written in ANSI C."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "libspex-doc-7.14.0-1.1.noarch.rpm"
RPM_HASH = "420ce2a7274f595a8688fe7d18205aaa8e1baf2cf112ba590b4735c587182e891825a9a8cf4b8b768d8a1db2b39534a4911f107a72706c7c044b0199d6ca36bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspex-doc"

RDEPENDS:${PN} += ""

inherit rpm
