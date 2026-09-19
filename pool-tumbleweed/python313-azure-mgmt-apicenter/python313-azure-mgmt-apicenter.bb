SUMMARY = "Microsoft Azure Apicenter Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Apicenter Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-mgmt-apicenter-1.0.0-2.9.noarch.rpm"
RPM_HASH = "004385a3ad9e759b11a9ab5b2861475937f87bba75a7f7619cd0eed8833c3303a6a3b1feccf39a65a9b0393df093f19062e7f28f7c9a23e275255cc76919478f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-apicenter \
python3.13dist-azure-mgmt-apicenter \
python313-azure-mgmt-apicenter \
python3dist-azure-mgmt-apicenter"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
