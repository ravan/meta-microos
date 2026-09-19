SUMMARY = "Microsoft Azure Weightsandbiases Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Weightsandbiases Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-weightsandbiases-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "c6deef596cbf045237b2300b3ea982073b97a8f26be7768b07c758ea78ea01eea65f41f010ff9b0b9889459a7d2f7bea7e7b686e2c3063427ae91dfd130e775d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-weightsandbiases \
python314-azure-mgmt-weightsandbiases \
python3dist-azure-mgmt-weightsandbiases"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
