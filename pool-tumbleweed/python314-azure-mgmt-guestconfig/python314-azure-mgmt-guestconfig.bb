SUMMARY = "Microsoft Azure Guestconfig Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Guestconfig Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python314-azure-mgmt-guestconfig-1.0.0b3-1.1.noarch.rpm"
RPM_HASH = "f60ee9c0b15c0d1cb1c8ae99f1f65b54eb458a94c5e101daf7225126ea6df4b266f96acce34d4f489db32fee423cdce0bc97919640325a2e29bb65fd093ee095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-guestconfig \
python314-azure-mgmt-guestconfig \
python3dist-azure-mgmt-guestconfig"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
