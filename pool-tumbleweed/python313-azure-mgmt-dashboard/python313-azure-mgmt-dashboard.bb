SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-dashboard-2.0.0-1.3.noarch.rpm"
RPM_HASH = "5d18807be70c5a3c059e67d3c0ca7ee1e5e89658b94390cb934ce80c96cd88748b51f402f8de192334e388148ddb3a4f168710ceb31bdb2ffec5bd6d90892f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-dashboard \
python3.13dist-azure-mgmt-dashboard \
python313-azure-mgmt-dashboard \
python3dist-azure-mgmt-dashboard"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
