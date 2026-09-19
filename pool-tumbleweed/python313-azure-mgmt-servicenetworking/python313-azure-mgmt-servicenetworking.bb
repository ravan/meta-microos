SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-servicenetworking-2.1.0-1.1.noarch.rpm"
RPM_HASH = "d66fe6deac98db83b67f62e63d62b44e8e98e6711d581c25a1e42b9d8730a9a646a8cc443ddc4e8d0b1b468b4300ee391d7743283671e06026708885a663466b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicenetworking \
python3.13dist-azure-mgmt-servicenetworking \
python313-azure-mgmt-servicenetworking \
python3dist-azure-mgmt-servicenetworking"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
