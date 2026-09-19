SUMMARY = "Microsoft Azure Image Builder Client Library"
DESCRIPTION = "This is the Microsoft Azure Image Builder Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-imagebuilder-2.0.0-1.2.noarch.rpm"
RPM_HASH = "5a3d0915b16557b0f55dfcff9e4d286013b331b53da13fe8592975b4d2d9461c29f11404ba9a5e1f8f172ae6ac2df6aebdaa2f2560735f10a63ffbecba64884a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-imagebuilder \
python3.13dist-azure-mgmt-imagebuilder \
python313-azure-mgmt-imagebuilder \
python3dist-azure-mgmt-imagebuilder"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
