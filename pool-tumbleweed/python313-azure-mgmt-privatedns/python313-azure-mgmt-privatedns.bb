SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python313-azure-mgmt-privatedns-1.2.0-1.9.noarch.rpm"
RPM_HASH = "c82394048dc3cbd06dc6885e2f130cf5f11e8ee058c220cd1f5ba293e07aa7f7cb85f80373a27ee346b42dcc4f9f76bc40048e963565b6915baa4198c78699da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-privatedns \
python3.13dist-azure-mgmt-privatedns \
python313-azure-mgmt-privatedns \
python3dist-azure-mgmt-privatedns"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
