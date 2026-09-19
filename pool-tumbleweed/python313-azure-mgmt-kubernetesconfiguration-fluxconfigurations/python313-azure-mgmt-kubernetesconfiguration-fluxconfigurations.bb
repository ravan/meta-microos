SUMMARY = "Microsoft Azure Kubernetesconfiguration-fluxconfigurations Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Kubernetesconfiguration-fluxconfigurations Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-kubernetesconfiguration-fluxconfigurations-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "1f33f2e719d18412f50a325c8b84e3a30db2a86e203d25fb07378342beb0a65c99a76e9b80a0534f4e3ac264c70a29db942540132f92f47959dcdcf724d7bb93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration-fluxconfigurations \
python3.13dist-azure-mgmt-kubernetesconfiguration-fluxconfigurations \
python313-azure-mgmt-kubernetesconfiguration-fluxconfigurations \
python3dist-azure-mgmt-kubernetesconfiguration-fluxconfigurations"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-kubernetesconfiguration \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
