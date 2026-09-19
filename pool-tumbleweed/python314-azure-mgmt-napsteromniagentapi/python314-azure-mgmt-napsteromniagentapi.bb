SUMMARY = "Microsoft Azure Napsteromniagentapi Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Napsteromniagentapi Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-napsteromniagentapi-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "fe9f51af5a114d1818bae23145cf0fe577f8031601118ff8940ec21f8be99cb9a1607392a236013184d44619ac71e9ebbefcb276d27a83d0f35f6d81b3a67a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-napsteromniagentapi \
python314-azure-mgmt-napsteromniagentapi \
python3dist-azure-mgmt-napsteromniagentapi"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
