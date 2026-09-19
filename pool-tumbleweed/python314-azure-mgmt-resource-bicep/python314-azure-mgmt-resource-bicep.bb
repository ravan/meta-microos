SUMMARY = "Microsoft Azure Resource Bicep Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Bicep Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-resource-bicep-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "9379f05aac7cb24e86efec0bd8df985238ee8d9a9795be14e7bd12f33edadd8b6efe4c3ddfdf8e7d0d6163f0517116305c34ce6bca9c7c3502c1c3c2127fbb93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resource-bicep \
python314-azure-mgmt-resource-bicep \
python3dist-azure-mgmt-resource-bicep"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-mgmt-resource \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
