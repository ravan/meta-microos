SUMMARY = "Microsoft Azure Bot Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Bot Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0.0"

RPM_NAME = "python314-azure-mgmt-botservice-2.0.0.0-2.9.noarch.rpm"
RPM_HASH = "4cd10ad7b65ccdf4648a0bbecd0a10ddadfcc3baa70239c73255640a2e0f01966c537ac0def875db53b574bfecc77607c050b453e7f52ac41b2ee6bbc4585f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-botservice \
python314-azure-mgmt-botservice \
python3dist-azure-mgmt-botservice"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
