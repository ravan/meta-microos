SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python313-azure-mgmt-avs-9.1.0-1.5.noarch.rpm"
RPM_HASH = "5ec96cd5665609f925d3d87212a9b1a69da5fdb29d19b02a1a2c0af07fbfacf0532c28985ddb48953bdad6cda2359bc726d914a58b296941a6c7671e5635c9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-avs \
python3.13dist-azure-mgmt-avs \
python313-azure-mgmt-avs \
python3dist-azure-mgmt-avs"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
