SUMMARY = "Microsoft Azure Devopsinfrastructure Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Devopsinfrastructure Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-devopsinfrastructure-1.0.0-1.8.noarch.rpm"
RPM_HASH = "8d3b935e204fdf46f39d93d22c7174ddbde1cf28c64157a6ec17dba2b8bc06e872bcc2784fbebe9b2f6a5ff367c394d4c261a2365cc9c72b0f32e77af5ce1c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-devopsinfrastructure \
python314-azure-mgmt-devopsinfrastructure \
python3dist-azure-mgmt-devopsinfrastructure"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
