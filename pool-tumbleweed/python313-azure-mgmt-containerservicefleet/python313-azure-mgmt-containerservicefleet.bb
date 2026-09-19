SUMMARY = "Microsoft Azure Containerservicefleet Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Containerservicefleet Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-mgmt-containerservicefleet-4.0.0-1.1.noarch.rpm"
RPM_HASH = "c3d932175e2426dd1798cf5baa9a51195d08915ea6e529ec39d4d76fb0ba75348d3baefc3d78f7c2dde95e327b159b5cc157f9aed9b281305be2c225a0ef2a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-containerservicefleet \
python3.13dist-azure-mgmt-containerservicefleet \
python313-azure-mgmt-containerservicefleet \
python3dist-azure-mgmt-containerservicefleet"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
