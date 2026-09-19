SUMMARY = "Microsoft Azure Planetarycomputer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Planetarycomputer Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-planetarycomputer-1.0.0-1.2.noarch.rpm"
RPM_HASH = "989ba969e3d73384042acc23e6753e13a63475901907e0be2c199a6f36f442c1b1592a070563881731f07ec98326ec893423d58c2db3c7d7b73ae883f953f638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-planetarycomputer \
python3.13dist-azure-mgmt-planetarycomputer \
python313-azure-mgmt-planetarycomputer \
python3dist-azure-mgmt-planetarycomputer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
