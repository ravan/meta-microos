SUMMARY = "Microsoft Azure Trustedsigning Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Trustedsigning Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-trustedsigning-1.0.1-1.2.noarch.rpm"
RPM_HASH = "75c7237a667112d561af6e8e242a71f8dca6d05bf54bd57a761b1668c7fe4d5ebf9a7898e171dcb6da8f8422f165e54ead8ca308f59e1dfd0a20cbf82e6b1d92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-trustedsigning \
python3.13dist-azure-mgmt-trustedsigning \
python313-azure-mgmt-trustedsigning \
python3dist-azure-mgmt-trustedsigning"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
