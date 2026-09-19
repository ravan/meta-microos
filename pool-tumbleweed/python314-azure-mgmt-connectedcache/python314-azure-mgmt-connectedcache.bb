SUMMARY = "Microsoft Azure Connectedcache Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedcache Management Client Library. \
 \
This package has been tested with Python 3.8+"
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-connectedcache-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "b8cb3b828cdf7b4b9c9daf35d3bbda29b9bd8b9ab06fab41fa6e233d27b5d063dabd6227b03e2845d797ebec37f405c13209c906a4a4d36e35890113deba6906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-connectedcache \
python314-azure-mgmt-connectedcache \
python3dist-azure-mgmt-connectedcache"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
