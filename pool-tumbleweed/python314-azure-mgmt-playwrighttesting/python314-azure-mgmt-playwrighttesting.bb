SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs \
that replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-playwrighttesting-1.0.1-1.4.noarch.rpm"
RPM_HASH = "79084fcf01fef1a5e2e604952cb0aea5bad33eb9329c2a82ad0d3f2fd95b5492792d65c42082fbca5f65cb8ca32c22b4e4c4b3c2d78a5c88f39054aadb0c6ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-playwrighttesting \
python314-azure-mgmt-playwrighttesting \
python3dist-azure-mgmt-playwrighttesting"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
