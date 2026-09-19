SUMMARY = "Microsoft Azure Napsteromniagentapi Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Napsteromniagentapi Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-napsteromniagentapi-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "ae19aa30b34c88b98508ff4d4194eabf471a1b77bb56920cd20597f333abf98d4766633c0a76d09c90189cea33aeda9268cf21ff6ded05432d7a67b370b2ab89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-napsteromniagentapi \
python3.13dist-azure-mgmt-napsteromniagentapi \
python313-azure-mgmt-napsteromniagentapi \
python3dist-azure-mgmt-napsteromniagentapi"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
