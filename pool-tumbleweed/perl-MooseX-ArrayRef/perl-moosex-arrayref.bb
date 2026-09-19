SUMMARY = "blessed arrayrefs with Moose"
DESCRIPTION = "Objects implemented with arrayrefs rather than hashrefs are often faster \
than those implemented with hashrefs. Moose's default object implementation \
is hashref based. Can we go faster? \
 \
Simply 'use MooseX::ArrayRef' instead of 'use Moose', but note the \
limitations in the section below. \
 \
The current implementation is mostly a proof of concept, but it does mostly \
seem to work."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.005"

RPM_NAME = "perl-MooseX-ArrayRef-0.005-1.41.noarch.rpm"
RPM_HASH = "315198c499cd6a4e3540b8d263756774a8da4828341c6e9a03deb40d6c7e5ee8dd317c3cc5e58cad15b6cdf49c3aeece4dc6d1c6b148645e1dc8772be1105d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--ArrayRef \
perl-MooseX--ArrayRef--Meta--Class \
perl-MooseX--ArrayRef--Meta--Instance \
perl-MooseX-ArrayRef"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
