SUMMARY = "Documentation for glucat-main"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions. \
 \
This package provides the documentation for glucat-main."
LICENSE = "LGPL-3.0-only"

PV = "0.13.0"

RPM_NAME = "glucat-doc-0.13.0-2.4.noarch.rpm"
RPM_HASH = "717ce22aff5ed824718d80bb0fb3789d742cdb3ddc574723f3bb6b119e29f5ccec1cb18fbd0fb543ee2bbafd0031a3d3ba96694d4ff56942ba43126121af65f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glucat-doc"

RDEPENDS:${PN} += ""

inherit rpm
