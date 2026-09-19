SUMMARY = "Microsoft Azure Networkfunction Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Networkfunction Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-networkfunction-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "3f03c4a9093b0da26bd1909f22a4ca17d80386eaf4b5d7ce5b2280ca5b76c3d7f42c31f394e6ae3227394137a8e7b65bd8cafcc78d05b2e86e99a226327cae28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-networkfunction \
python3.13dist-azure-mgmt-networkfunction \
python313-azure-mgmt-networkfunction \
python3dist-azure-mgmt-networkfunction"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
