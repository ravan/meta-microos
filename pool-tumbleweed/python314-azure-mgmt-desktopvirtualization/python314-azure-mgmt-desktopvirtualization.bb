SUMMARY = "Microsoft Azure Desktop Virtualization Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Desktop Virtualization Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-desktopvirtualization-2.0.0-1.9.noarch.rpm"
RPM_HASH = "65b622fa67b410619c226d2d5ee89e790f8a0189ce450aac20bd70e4fe18d2919cb4a257929617b2121ccb37c09b513c7564f6059b81bd6b673039f605b2f251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-desktopvirtualization \
python314-azure-mgmt-desktopvirtualization \
python3dist-azure-mgmt-desktopvirtualization"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
