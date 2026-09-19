SUMMARY = "Microsoft Azure Durabletask Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Durabletask Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-mgmt-durabletask-1.1.0-1.2.noarch.rpm"
RPM_HASH = "7357023a451b1d03866227e53e7ce2d8749fd04d2771df77267e6c28dbbbd24b82ae15b9ca10f9a930731480e2ec9b169d0e26c3073e99700654ed6082c4245c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-durabletask \
python314-azure-mgmt-durabletask \
python3dist-azure-mgmt-durabletask"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
