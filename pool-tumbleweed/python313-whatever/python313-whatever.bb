SUMMARY = "Module to make anonymous functions by partial application of operators"
DESCRIPTION = "A Python module to make lambdas by partial application of python operators. \
It is inspired by the Perl 6 one, see http://perlcabal.org/syn/S02.html#The_Whatever_Object"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python313-whatever-0.7-3.5.noarch.rpm"
RPM_HASH = "695482c5a67fd845d365c18087fd3759f20441a4d39ed1cd07768559ffa3f1e2d4092be8e849d2d06d4165185b85e1611d1d653203089d7c4b907006c1271996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatever \
python3.13dist-whatever \
python313-whatever \
python3dist-whatever"

RDEPENDS:${PN} += "python-abi"

inherit rpm
