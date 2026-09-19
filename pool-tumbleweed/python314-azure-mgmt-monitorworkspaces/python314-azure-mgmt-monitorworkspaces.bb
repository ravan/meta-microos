SUMMARY = "Microsoft Azure Monitorworkspaces Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Monitorworkspaces Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-monitorworkspaces-1.0.0-1.2.noarch.rpm"
RPM_HASH = "6b82c2ad3f1f53053dda7624e34929c33e0f46a492468bf6600be918c8672e473318f066b143edd28d270cc0a707f5b77c85365dfba255a8ca037ae48b155327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-monitorworkspaces \
python314-azure-mgmt-monitorworkspaces \
python3dist-azure-mgmt-monitorworkspaces"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
