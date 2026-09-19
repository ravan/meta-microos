SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-orbital-2.0.0-2.9.noarch.rpm"
RPM_HASH = "92e50c983f016787ae9e9595344d7a0691bbf07f6675ccad9e080328591782a407ddabf7f62d536a6cfd94cbe1ebd95a282dabd9a477140c611900c8e42bced1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-orbital \
python3.13dist-azure-mgmt-orbital \
python313-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
