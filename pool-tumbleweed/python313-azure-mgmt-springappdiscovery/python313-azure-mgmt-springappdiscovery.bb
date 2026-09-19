SUMMARY = "Microsoft Azure Springappdiscovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Springappdiscovery Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-springappdiscovery-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "1c011746cae9231c40cc66a84da1f8f80bc2228335c02aa9ea93c0c6c0eb88671c036c2ecf104785b701d0418106112715240295cfb6c1a43167ae64af95c2b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-springappdiscovery \
python3.13dist-azure-mgmt-springappdiscovery \
python313-azure-mgmt-springappdiscovery \
python3dist-azure-mgmt-springappdiscovery"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
