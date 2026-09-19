SUMMARY = "Microsoft Azure Kubernetesconfiguration-fluxconfigurations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-fluxconfigurations Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-kubernetesconfiguration-fluxconfigurations-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "c2357eee9b96b30483fb3b31afa83b49f837328aeb1fc854f79d972599a6c179c312c4258b6d0ede6d45d1def8dd1e66d2bff03b1d199b87ca3131519969282e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-kubernetesconfiguration-fluxconfigurations \
python314-azure-mgmt-kubernetesconfiguration-fluxconfigurations \
python3dist-azure-mgmt-kubernetesconfiguration-fluxconfigurations"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-kubernetesconfiguration \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
