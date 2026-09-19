SUMMARY = "Microsoft Azure Newrelicobservability Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Newrelicobservability Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-newrelicobservability-1.1.0-1.9.noarch.rpm"
RPM_HASH = "58e760a4d4a2273ed967aadbbb228b665818b15e137a20284bafe98882bb348d31ae5644532aba323ec866c316289783e7675b56525f5ba07bbc219d09ded8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-newrelicobservability \
python3.13dist-azure-mgmt-newrelicobservability \
python313-azure-mgmt-newrelicobservability \
python3dist-azure-mgmt-newrelicobservability"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
