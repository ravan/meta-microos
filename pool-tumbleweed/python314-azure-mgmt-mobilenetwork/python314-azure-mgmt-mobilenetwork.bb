SUMMARY = "Microsoft Azure Mobilenetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mobilenetwork Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python314-azure-mgmt-mobilenetwork-3.3.1-1.4.noarch.rpm"
RPM_HASH = "fbac7ebf0143717a0cdcfcefe26aec48927390f7b02faa8a1ffda5f7c44ebdc2f2407453ce9a412776465b4824e7df613308a2394f8034637709803d4e6e1c23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-mobilenetwork \
python314-azure-mgmt-mobilenetwork \
python3dist-azure-mgmt-mobilenetwork"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
