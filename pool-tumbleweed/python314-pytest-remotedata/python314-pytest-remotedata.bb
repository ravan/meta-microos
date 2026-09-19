SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python314-pytest-remotedata-0.4.1-2.6.noarch.rpm"
RPM_HASH = "e8dff33755ef484521a272249e254294e11fd2bd025a7440decbac28fd294c1a06fe6dbb98c696d1fe53757c0ce33fd5baaafeaec8fff43311c54def434f1d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-remotedata \
python314-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-pytest"

inherit rpm
