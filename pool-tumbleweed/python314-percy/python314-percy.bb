SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-percy-2.0.2-4.2.noarch.rpm"
RPM_HASH = "93b679754bb62de6c5e23213c038dc50d4c9bb27b6999e029384e44bf86255a28723f0a104c49d98ca2d12e4da9b3deef9cd5e06a347051da6bd1332c953565e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-percy \
python314-percy \
python3dist-percy"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
