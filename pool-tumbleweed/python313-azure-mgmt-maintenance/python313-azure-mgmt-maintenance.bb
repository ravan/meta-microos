SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-maintenance-2.1.0-2.9.noarch.rpm"
RPM_HASH = "3d63b4ea75ce9c1810940ccd8f45af79aead53a7bd954ec5abdb287df6438b9bc6e9a28b5ccc7976dc3e9391a7b40f0bbc0fed30baa3c890584cf7a72c4857d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-maintenance \
python3.13dist-azure-mgmt-maintenance \
python313-azure-mgmt-maintenance \
python3dist-azure-mgmt-maintenance"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
