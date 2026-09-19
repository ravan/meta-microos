SUMMARY = "Pytest plugin for controlling remote data access"
DESCRIPTION = "This package provides a plugin for the pytest framework that allows \
developers to control unit tests that require access to data from the internet."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python313-pytest-remotedata-0.4.1-2.6.noarch.rpm"
RPM_HASH = "2d5fa87121ee114613ded8448f22ac7f3d76b007b1f032c0db7026733bcfa2438380e7a82054a34b90fabd5f3f65a91b3ad89ea80915f4ca77dbf4a102cecebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-remotedata \
python3.13dist-pytest-remotedata \
python313-pytest-remotedata \
python3dist-pytest-remotedata"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-pytest"

inherit rpm
