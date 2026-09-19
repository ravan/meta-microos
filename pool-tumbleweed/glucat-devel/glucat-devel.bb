SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions. \
 \
This package contains the header files required for developing \
applications using the glucat library."
LICENSE = "LGPL-3.0-only"

PV = "0.13.0"

RPM_NAME = "glucat-devel-0.13.0-2.4.noarch.rpm"
RPM_HASH = "c8891e90a74065bf8e5a1de43df3e06509bfe50c997b9506b028f418b481d1d1ac52e13de46550356805e952fc080fb861e939f1a3036bdb76556dd7c317ca35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glucat-devel"

RDEPENDS:${PN} += ""

inherit rpm
