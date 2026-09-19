SUMMARY = "Microsoft Azure Kubernetesconfiguration-extensions Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-extensions Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-kubernetesconfiguration-extensions-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "afe0e06960977257a6580b5e7f9674c39aeffa574472ec68f7e3a9f3abbac42a02deaed8d8aa1cc48b31d1ffc6f147ce7eb8a748b6928fda7454077117e5d8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration-extensions \
python3.13dist-azure-mgmt-kubernetesconfiguration-extensions \
python313-azure-mgmt-kubernetesconfiguration-extensions \
python3dist-azure-mgmt-kubernetesconfiguration-extensions"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-kubernetesconfiguration \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
