SUMMARY = "Microsoft Azure Search Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Search Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python313-azure-mgmt-search-9.2.0-1.5.noarch.rpm"
RPM_HASH = "0de417faee1addfa21fdb6f8e5a2fd37b0c95e6971aace6e6c6b7707109836b69537ed81f8dff9105f5c763c480b546fb1d113503bc1de6e9cc0a0cac730fc75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-search \
python3.13dist-azure-mgmt-search \
python313-azure-mgmt-search \
python3dist-azure-mgmt-search"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
