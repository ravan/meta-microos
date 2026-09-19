SUMMARY = "Microsoft Azure Recovery Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python314-azure-mgmt-recoveryservices-4.2.0-1.1.noarch.rpm"
RPM_HASH = "9b28eec0f3b6b4b26ce2e0adcd305039c348d07c7b3ade043406cf77b15c5343ebadacb05ccf0813cfaa5f9034be60400e66d714cc9c2d4d93b9239ffec0cba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-recoveryservices \
python314-azure-mgmt-recoveryservices \
python3dist-azure-mgmt-recoveryservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
