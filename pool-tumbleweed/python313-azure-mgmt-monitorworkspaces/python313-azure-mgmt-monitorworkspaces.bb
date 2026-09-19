SUMMARY = "Microsoft Azure Monitorworkspaces Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Monitorworkspaces Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-monitorworkspaces-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b15c4ce9603dd5d00ca3d773eddcbf3bb7ce91bf250b454386d8718cf63745a57302c9393c2adfaf4d5f245c0d17057c2a2e3462d9c5315eb64f9dfe6cecb134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-monitorworkspaces \
python3.13dist-azure-mgmt-monitorworkspaces \
python313-azure-mgmt-monitorworkspaces \
python3dist-azure-mgmt-monitorworkspaces"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
