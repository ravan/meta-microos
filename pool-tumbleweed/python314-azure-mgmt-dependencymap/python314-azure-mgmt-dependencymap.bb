SUMMARY = "Microsoft Azure Dependencymap Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dependencymap Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-dependencymap-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "552f4b3694916326caef2af8538d6b19871f63fc2e90ee019ff6bad3b87d6ece7cc6429d0d61e26897187569724bdb1edc74538e3911a9c891a3b35941235a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-dependencymap \
python314-azure-mgmt-dependencymap \
python3dist-azure-mgmt-dependencymap"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
