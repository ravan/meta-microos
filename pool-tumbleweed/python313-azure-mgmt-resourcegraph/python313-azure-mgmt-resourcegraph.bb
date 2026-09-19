SUMMARY = "Microsoft Azure Resource Graph Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Graph Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "python313-azure-mgmt-resourcegraph-8.0.1-1.4.noarch.rpm"
RPM_HASH = "c0a57bbc2649c55333d77e8a3707aabcce7714207022704f0b54bc0d155e0188c04a8984860bad6b3073b81d248e5a628ce11b1902fc90bf1cc00c448627cd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcegraph \
python3.13dist-azure-mgmt-resourcegraph \
python313-azure-mgmt-resourcegraph \
python3dist-azure-mgmt-resourcegraph"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-msrest >= 0.7.1 with python313-msrest < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
