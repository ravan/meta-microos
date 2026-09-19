SUMMARY = "Microsoft Azure Sitemanager Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sitemanager Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-sitemanager-1.0.1-1.3.noarch.rpm"
RPM_HASH = "52405844660e5bf8e410c59db3c27c3d43f4b054559c124a107a462b8e7906232e4034beb28d9d822409fcd4bb451de49d1d474ca7a5907c6e2da7f02af98039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-sitemanager \
python314-azure-mgmt-sitemanager \
python3dist-azure-mgmt-sitemanager"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
