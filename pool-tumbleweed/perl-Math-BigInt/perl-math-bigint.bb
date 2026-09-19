SUMMARY = "Arbitrary size integer math package"
DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.005003"

RPM_NAME = "perl-Math-BigInt-2.005003-1.7.noarch.rpm"
RPM_HASH = "cf10e7f810fa260da3291bb83f13c4493eca2aa4f86ebc731d0c6563314ac0ce11ddff82ad9b2519335b652ee40beaade6642a34f74df04fd5bc655ab964b454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--BigFloat \
perl-Math--BigInt \
perl-Math--BigInt--Calc \
perl-Math--BigInt--Lib \
perl-Math--BigRat \
perl-Math-BigInt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-Math--Complex"

inherit rpm
