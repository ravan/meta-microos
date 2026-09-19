SUMMARY = "A flow-based testing framework"
DESCRIPTION = "This module provides a flow-based testing framework. testflo supports \
testing of the OpenMDAO framework. Some OpenMDAO features require \
execution under MPI, while others don't. testflo runs all of the \
authors' tests in the same way and allows them to build their tests \
using unittest.TestCase objects that they are familiar with."
LICENSE = "Apache-2.0"

PV = "1.4.22"

RPM_NAME = "python314-testflo-1.4.22-1.2.noarch.rpm"
RPM_HASH = "41e29e617399f30eab9d9524898f17d2f23a729fafb2a68e2a215190be38e361307aac0a4db15eedde19a40259b0f5c5cf708bc2a80d08751a6f9cb5eb0118dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testflo \
python314-testflo \
python3dist-testflo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-setuptools \
update-alternatives"

inherit rpm
