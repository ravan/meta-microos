SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python313-pretend-1.0.9-4.5.noarch.rpm"
RPM_HASH = "9d3af350c0fb281a2720a8c7fa245f956789597ae601c46ff6ad820d482e40960927d14f565fd3af31acf1e58cc1886e678b880b71738a42d9011547d223aae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pretend \
python3.13dist-pretend \
python313-pretend \
python3dist-pretend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
