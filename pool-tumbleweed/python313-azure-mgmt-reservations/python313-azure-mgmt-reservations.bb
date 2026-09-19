SUMMARY = "Microsoft Azure Reservations Client Library"
DESCRIPTION = "This is the Microsoft Azure Reservations Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-azure-mgmt-reservations-2.3.0-2.9.noarch.rpm"
RPM_HASH = "9293d2e510ec54b7ca7af0b5c0c6e212030b20e2d3e30a46ad02428e65c75d659c1768f3996bcf2999bfa18301488ee701d012bb5c802d71230cc10c647134e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-reservations \
python3.13dist-azure-mgmt-reservations \
python313-azure-mgmt-reservations \
python3dist-azure-mgmt-reservations"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
