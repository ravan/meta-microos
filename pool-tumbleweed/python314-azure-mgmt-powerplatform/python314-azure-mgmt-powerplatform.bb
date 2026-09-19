SUMMARY = "Microsoft Azure Powerplatform Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Powerplatform Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-powerplatform-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "c9da86838b5a7f8aae00534ba904ba1f28c434eed9ede756d41f4357f35cc7c925fed8d0d8c1caae8bd7207bda84a46bbdc5ba8d293df537161c6382db12bd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-powerplatform \
python314-azure-mgmt-powerplatform \
python3dist-azure-mgmt-powerplatform"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
