SUMMARY = "Microsoft Azure Kubernetesconfiguration-extensions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-extensions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-kubernetesconfiguration-extensions-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "035836f7a050b792e1843d21fcc7f7333056f38a6afa13f45ba535cff68b3922a0112f35c3da5360644452b12a3c8f23ffe71a6ddc7eded5ead35f7caf59e966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-kubernetesconfiguration-extensions \
python314-azure-mgmt-kubernetesconfiguration-extensions \
python3dist-azure-mgmt-kubernetesconfiguration-extensions"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-kubernetesconfiguration \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
