SUMMARY = "Microsoft Azure Sitemanager Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Sitemanager Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-sitemanager-1.0.1-1.3.noarch.rpm"
RPM_HASH = "0e0946a29a756d9be9b05bb024cb37370d3db161c27bc7fbd8b9bfb1733f95b1c4de9f9bb6c2d1e8862954df0bd641c4066f526f304dc3157177d8acba3aa47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-sitemanager \
python3.13dist-azure-mgmt-sitemanager \
python313-azure-mgmt-sitemanager \
python3dist-azure-mgmt-sitemanager"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
