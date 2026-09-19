SUMMARY = "Microsoft Azure Hdinsightcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hdinsightcontainers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b4"

RPM_NAME = "python314-azure-mgmt-hdinsightcontainers-1.0.0~b4-1.1.noarch.rpm"
RPM_HASH = "94bc2827a7c6b3dcc14c5c804693531418b5d56fbf4968329bd7a7bdb2ed3d2107de9c4370199c72a347ed700d76d1924a42dcc75df0c5000a3ec07fe8399203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-hdinsightcontainers \
python314-azure-mgmt-hdinsightcontainers \
python3dist-azure-mgmt-hdinsightcontainers"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
