SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "30.2.0"

RPM_NAME = "python313-azure-mgmt-network-30.2.0-1.4.noarch.rpm"
RPM_HASH = "1792c543a79a39121f0db345dc2bb35506ce5dd907a77bf6ccfc32e55c1d0f6cf9b074e471d315c238bc9410764a5fbf0e2f6fe6db64273c3fefef2e5ff66fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-network \
python3.13dist-azure-mgmt-network \
python313-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
