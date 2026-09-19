SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "15.2.4"

RPM_NAME = "armadillo-doc-15.2.4-1.2.noarch.rpm"
RPM_HASH = "8d6f3ba6582d305ca8055f924bcbe677af1fd096be15389b55d1af819c10d815cbd4c504492fb6f2f5f9639a7a1577836a32dafe4919452d1019b8dbf0b757ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"

RDEPENDS:${PN} += ""

inherit rpm
