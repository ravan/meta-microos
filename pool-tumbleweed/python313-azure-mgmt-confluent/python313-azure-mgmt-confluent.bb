SUMMARY = "Microsoft Azure Confluent Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confluent Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-confluent-2.1.0-1.9.noarch.rpm"
RPM_HASH = "d3eed44b9e32a737bcc6f03167e4c522655266096a0b917072dadbbf9e77f8546ebfa2c712b25f770c9ab1b6b167461f9a7781d1391e207b2eeb2999c57def78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confluent \
python3.13dist-azure-mgmt-confluent \
python313-azure-mgmt-confluent \
python3dist-azure-mgmt-confluent"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
