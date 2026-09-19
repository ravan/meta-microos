SUMMARY = "Microsoft Azure Programenrollment Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Programenrollment Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-programenrollment-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "5b421c5482b4d62ada9184f6a5f62144066ec83e7ef67559af1b0a97a83689c2cb852865b26ba8be4374f0762423eef881958bc1cf8277773cbf118d6d62b276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-programenrollment \
python3.13dist-azure-mgmt-programenrollment \
python313-azure-mgmt-programenrollment \
python3dist-azure-mgmt-programenrollment"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
