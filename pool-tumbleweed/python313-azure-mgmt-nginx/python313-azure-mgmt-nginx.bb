SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-azure-mgmt-nginx-4.0.0-1.3.noarch.rpm"
RPM_HASH = "41d89e058b6a881409095ebc554f8ef3a64c1bddc0af496ee4fe2778ddcc5120248883e21700f85f9b5d9252a7b36ead84e8b9f5faba3714ee007bdba074e8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-nginx \
python3.13dist-azure-mgmt-nginx \
python313-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
