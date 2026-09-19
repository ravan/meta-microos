SUMMARY = "Microsoft Azure Portal Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Portal Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-portal-1.0.1-1.2.noarch.rpm"
RPM_HASH = "59ab00dcb7f605ef61cbf82c23207008178b945b74561c9884f0b3a722a7e575425b9b569ca527be75585778e5a10fd02dfed9d8dce0218fac4e1fa18d75a5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-portal \
python3.13dist-azure-mgmt-portal \
python313-azure-mgmt-portal \
python3dist-azure-mgmt-portal"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
