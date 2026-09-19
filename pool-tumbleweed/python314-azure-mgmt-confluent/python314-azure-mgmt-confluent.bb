SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-confluent-2.1.0-1.9.noarch.rpm"
RPM_HASH = "409bfa694397ae54e24f392eaadccc3b93e418ed402c512acc43438b1f98ad059dbc9db91f91ef029aca65d2bdfa809f675b03e85f605d57279b69b548792f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-confluent \
python314-azure-mgmt-confluent \
python3dist-azure-mgmt-confluent"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
