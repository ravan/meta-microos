SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0~b1"

RPM_NAME = "python314-azure-mgmt-containerinstance-10.2.0~b1-1.8.noarch.rpm"
RPM_HASH = "14cff6a617af57ce5b2f2f94f87c9bf60d0533eb1fc07b9cb4d1b18079f83c9536159eb516c5bb8eebc8a972061e691b6dfe02668843a6f299142ef13613b204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-containerinstance \
python314-azure-mgmt-containerinstance \
python3dist-azure-mgmt-containerinstance"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
