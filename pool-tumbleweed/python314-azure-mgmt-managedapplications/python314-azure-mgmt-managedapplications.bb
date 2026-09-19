SUMMARY = "Microsoft Azure Managedapplications Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Managedapplications Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-managedapplications-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "9efed5b81d098559d199b4e11f612199cc0ff4421c3f81b8bbba6813b61bac41617fd1d8085a3442062b49517ec4b290f3712566c0905cb0daa4cc7970517f32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-managedapplications \
python314-azure-mgmt-managedapplications \
python3dist-azure-mgmt-managedapplications"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
