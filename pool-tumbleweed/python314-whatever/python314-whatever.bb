SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python314-whatever-0.7-3.5.noarch.rpm"
RPM_HASH = "6bda3664aea9c66f9fb24d4894c2eacc10e6bcf614851a30b4272df436f8e40cc26132c98c42a1a7bc4eb5a75cb91d1c526b5d1b19ed84d45b3b5f0c59c0ebeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-whatever \
python314-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
