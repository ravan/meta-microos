SUMMARY = "Async generators and context managers for Python 3.5+"
DESCRIPTION = "Python 3.6 added async generators. Python 3.7 adds some more \
tools to make them usable, like contextlib.asynccontextmanager."
LICENSE = "Apache-2.0 | MIT"

PV = "1.10"

RPM_NAME = "python314-async_generator-1.10-4.5.noarch.rpm"
RPM_HASH = "ad157f6ce6fad83a8d4de2a2318563200043dd6c67bf6fe7394c1b36dd437ed5d8b6b1dc57f5f92900e3403d40978005f8ab8199aaa17504c4128796b61a3acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-async-generator \
python314-async-generator \
python3dist-async-generator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
