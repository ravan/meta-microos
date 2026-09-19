SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-azure-mgmt-servermanager-2.0.1-1.9.noarch.rpm"
RPM_HASH = "80841bd6548ac2130942b5f7590b5f47f35aecfbcb90d1aa8ad57a7ad69af8d1ffbfe79eea8fa411c85f3b5aea7a30ac68c61d01757cebbdbdb119c1d22db672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servermanager \
python3.13dist-azure-mgmt-servermanager \
python313-azure-mgmt-servermanager \
python3dist-azure-mgmt-servermanager"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
