SUMMARY = "Microsoft Azure Hdinsightcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hdinsightcontainers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python313-azure-mgmt-hdinsightcontainers-1.0.0~b4-1.1.noarch.rpm"
RPM_HASH = "a9401c8ad474b44802b38b7c7bd8c13750073b02aa458e7d01363c910b8d110ddc6da72b0c5a4be073740787c4a449aa9040fb5df271eef43942065082efbb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hdinsightcontainers \
python3.13dist-azure-mgmt-hdinsightcontainers \
python313-azure-mgmt-hdinsightcontainers \
python3dist-azure-mgmt-hdinsightcontainers"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
