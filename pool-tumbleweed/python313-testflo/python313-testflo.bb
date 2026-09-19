SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.22"

RPM_NAME = "python313-testflo-1.4.22-1.2.noarch.rpm"
RPM_HASH = "999fa1489b044a2d204a13c3d976a0bed30e883357586ae1a02183a234d52145928c6983cbdb5e703172a8907f234a8c0930610a47a077f9df84906d60706515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testflo \
python3.13dist-testflo \
python313-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-setuptools \
update-alternatives"

inherit rpm
