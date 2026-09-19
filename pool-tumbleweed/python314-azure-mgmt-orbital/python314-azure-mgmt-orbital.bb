SUMMARY = "Microsoft Azure Orbital Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Orbital Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-orbital-2.0.0-2.9.noarch.rpm"
RPM_HASH = "f1cc96784d25081e0f32617ee62139a4e93030760f7ca5e6ade6dda1aac9ab691cb8092d8ce539f7be63c575f3ad75b2fb191bccc11aed0145a8c7fd439d8876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-orbital \
python314-azure-mgmt-orbital \
python3dist-azure-mgmt-orbital"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
