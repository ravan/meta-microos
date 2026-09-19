SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-graphservices-1.0.0-2.9.noarch.rpm"
RPM_HASH = "08ee4af8b0269610d90037a44652152431bf2b4342c4886fce7579548f4e1b4b830f178e5ae646738de8aef799f83c4076b6502562ef34cc35ca2593b1ba7c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-graphservices \
python314-azure-mgmt-graphservices \
python3dist-azure-mgmt-graphservices"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
