SUMMARY = "Microsoft Azure HybridKubernetes Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure HybridKubernetes Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-azure-mgmt-hybridkubernetes-1.2.0-1.2.noarch.rpm"
RPM_HASH = "354e8aa02b6753d1024c766acebd747610fe929f7f1ae0740f920fd3d633b98f7161259eea685f2c7a3fdd33fc4226b6ffeeae76a4df7cbb1035fec3e46b3131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hybridkubernetes \
python314-azure-mgmt-hybridkubernetes \
python3dist-azure-mgmt-hybridkubernetes"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
