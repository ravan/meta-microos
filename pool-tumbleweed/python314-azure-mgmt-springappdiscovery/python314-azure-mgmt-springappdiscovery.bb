SUMMARY = "Microsoft Azure Springappdiscovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Springappdiscovery Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-springappdiscovery-1.0.0~b1-2.9.noarch.rpm"
RPM_HASH = "5a16818057f0a756bcb54476a24586e332dc9c4e2e315a655190d14655929a936bb9b36e9bdd69911d5686d372990a944834f738a0a2916e1bdf09ab6a72370b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-springappdiscovery \
python314-azure-mgmt-springappdiscovery \
python3dist-azure-mgmt-springappdiscovery"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
