SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.15"

RPM_NAME = "python311-testflo-1.4.15-1.10.noarch.rpm"
RPM_HASH = "a1f7321f01f4766ff001347f1170f2447049de2f922658754d1753e3b60e842de3798b2aa865e788fedc7a19371777c0dc1673fb7cc094962e2f662e50ea6252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-testflo \
python311-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
