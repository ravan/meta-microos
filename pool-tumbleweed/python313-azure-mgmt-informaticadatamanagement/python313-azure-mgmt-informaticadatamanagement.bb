SUMMARY = "Microsoft Azure Informaticadatamanagement Management Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-informaticadatamanagement-1.0.0-1.9.noarch.rpm"
RPM_HASH = "ea5c758cc74a43980710787342a81042d1904782065b1e2533137174e16c930e7e9b9240d214c2b269946acfd23d9f2f54e84c93fd7e70f0dc3911e6002e12de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-informaticadatamanagement \
python3.13dist-azure-mgmt-informaticadatamanagement \
python313-azure-mgmt-informaticadatamanagement \
python3dist-azure-mgmt-informaticadatamanagement"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
