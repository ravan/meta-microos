SUMMARY = "Microsoft Azure Kubernetes Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Kubernetes Configuration Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-azure-mgmt-kubernetesconfiguration-3.1.0-2.9.noarch.rpm"
RPM_HASH = "9ccac9c559d355ac2d51a5b0471300021c6907e5bd91468c9de7bc860ec3ade8f9a7fceda77016d3d4989e729fd550d78e8da2991276f707d66bf4fc3552a56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-kubernetesconfiguration \
python3.13dist-azure-mgmt-kubernetesconfiguration \
python313-azure-mgmt-kubernetesconfiguration \
python3dist-azure-mgmt-kubernetesconfiguration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
