SUMMARY = "Microsoft Azure Container Instance Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Instance Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0~b1"

RPM_NAME = "python313-azure-mgmt-containerinstance-10.2.0~b1-1.8.noarch.rpm"
RPM_HASH = "1b581a8beccdfd56e5006541295016e184e55f2071e242b01420af6ce64e128fb220f4e37462a9266f2f1d1b3da25b9e993278b1b992403364698a6dd01030de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerinstance \
python3.13dist-azure-mgmt-containerinstance \
python313-azure-mgmt-containerinstance \
python3dist-azure-mgmt-containerinstance"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
