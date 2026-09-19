SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "30.2.0"

RPM_NAME = "python314-azure-mgmt-network-30.2.0-1.4.noarch.rpm"
RPM_HASH = "ddee44f59f317850b7056c9b67998c7ac871e09e78d7f9100e48d6ee4cc3ce9f9a0416bcadecffddd83406bc789334b3745fa6a45ce271a5202ff412638d2abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-network \
python314-azure-mgmt-network \
python3dist-azure-mgmt-network"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
