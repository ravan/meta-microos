SUMMARY = "A library for stubbing in Python"
DESCRIPTION = "Pretend is a library to make stubbing with Python easier."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python314-pretend-1.0.9-4.5.noarch.rpm"
RPM_HASH = "95baace8fe15989cdc4ba93f677aba88108edd2631c94652d9fa0716182f99eef15b85b3b76a8cb30409f073df71df3d2a4ba2fd6431b8fe5abd12f7dccbb705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pretend \
python314-pretend \
python3dist-pretend"

RDEPENDS:${PN} += "python-abi"

inherit rpm
