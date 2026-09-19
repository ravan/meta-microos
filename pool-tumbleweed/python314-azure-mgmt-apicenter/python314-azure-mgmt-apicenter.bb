SUMMARY = "Microsoft Azure Apicenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Apicenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-apicenter-1.0.0-2.9.noarch.rpm"
RPM_HASH = "e1b5c2d883053b9f1faafe9fe4858797ee8945d837fb690416c30af51713343a1f49507899b1929b87f04316f6d01568e1dea70a8816954c5008a30a0733e55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-apicenter \
python314-azure-mgmt-apicenter \
python3dist-azure-mgmt-apicenter"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
