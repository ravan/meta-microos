SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-newrelicobservability-1.1.0-1.9.noarch.rpm"
RPM_HASH = "c66936db5621dff7e44af0f215980da7d8fae03e1d71862669155cdb08c36a1843f5f7208f103be5d9d9c370eebfe6655abf02b8a239ab77f7eed6def709ab69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-newrelicobservability \
python314-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
